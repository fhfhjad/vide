var jingoalRootURL = "http://web.jingoal.com/mgt/";
var jingoalSHA1 = {
	hexcase : 0,
	chrsz : 8,
	hex_sha1 : function(s) {
		return this.binb2hex(this.core_sha1(this.str2binb(s), s.length * this.chrsz));
	},
	core_sha1 : function (x, len) {
		x[len >> 5] |= 128 << (24 - len % 32);
		x[((len + 64 >> 9) << 4) + 15] = len;
		var w = Array(80);
		var a = 1732584193;
		var b = -271733879;
		var c = -1732584194;
		var d = 271733878;
		var e = -1009589776;
		for (var i = 0; i < x.length; i += 16) {
			var olda = a;
			var oldb = b;
			var oldc = c;
			var oldd = d;
			var olde = e;
			for (var j = 0; j < 80; j++) {
				if (j < 16) {
					w[j] = x[i + j];
				} else {
					w[j] = this.rol(w[j - 3] ^ w[j - 8] ^ w[j - 14] ^ w[j - 16], 1);
				}
				var t = this.safe_add(this.safe_add(this.rol(a, 5), this.sha1_ft(j, b, c, d)), this.safe_add(this.safe_add(e, w[j]), this.sha1_kt(j)));
				e = d;
				d = c;
				c = this.rol(b, 30);
				b = a;
				a = t;
			}
			a = this.safe_add(a, olda);
			b = this.safe_add(b, oldb);
			c = this.safe_add(c, oldc);
			d = this.safe_add(d, oldd);
			e = this.safe_add(e, olde);
		}
		return Array(a, b, c, d, e);
	},
	sha1_ft : function(t, b, c, d) {
		if (t < 20) {
			return (b & c) | ((~b) & d);
		}
		if (t < 40) {
			return b ^ c ^ d;
		}
		if (t < 60) {
			return (b & c) | (b & d) | (c & d);
		}
		return b ^ c ^ d;
	},
	sha1_kt : function(t) {
		return (t < 20) ? 1518500249 : (t < 40) ? 1859775393 : (t < 60) ? -1894007588 : -899497514;
	},
	safe_add : function(x, y) {
		var lsw = (x & 65535) + (y & 65535);
		var msw = (x >> 16) + (y >> 16) + (lsw >> 16);
		return (msw << 16) | (lsw & 65535);
	},
	rol : function(num, cnt) {
		return (num << cnt) | (num >>> (32 - cnt));
	},
	str2binb : function(str) {
		var bin = Array();
		var mask = (1 << this.chrsz) - 1;
		for (var i = 0; i < str.length * this.chrsz; i += this.chrsz) {
			bin[i >> 5] |= (str.charCodeAt(i / this.chrsz) & mask) << (32 - this.chrsz - i % 32);
		}
		return bin;
	},
	binb2hex : function(binarray) {
		var hex_tab = this.hexcase ? "0123456789ABCDEF" : "0123456789abcdef";
		var str = "";
		for (var i = 0; i < binarray.length * 4; i++) {
			str += hex_tab.charAt((binarray[i >> 2] >> ((3 - i % 4) * 8 + 4)) & 15) + hex_tab.charAt((binarray[i >> 2] >> ((3 - i % 4) * 8)) & 15);
		}
		return str;
	}
}