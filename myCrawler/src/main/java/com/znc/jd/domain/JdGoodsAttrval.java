package com.znc.jd.domain;

import java.io.Serializable;

public class JdGoodsAttrval implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jd_goods_attrval.id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jd_goods_attrval.goods_id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jd_goods_attrval.goods_attr
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String goodsAttr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jd_goods_attrval.goods_val
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String goodsVal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jd_goods_attrval
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jd_goods_attrval.id
     *
     * @return the value of jd_goods_attrval.id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jd_goods_attrval.id
     *
     * @param id the value for jd_goods_attrval.id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jd_goods_attrval.goods_id
     *
     * @return the value of jd_goods_attrval.goods_id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jd_goods_attrval.goods_id
     *
     * @param goodsId the value for jd_goods_attrval.goods_id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jd_goods_attrval.goods_attr
     *
     * @return the value of jd_goods_attrval.goods_attr
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getGoodsAttr() {
        return goodsAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jd_goods_attrval.goods_attr
     *
     * @param goodsAttr the value for jd_goods_attrval.goods_attr
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jd_goods_attrval.goods_val
     *
     * @return the value of jd_goods_attrval.goods_val
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getGoodsVal() {
        return goodsVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jd_goods_attrval.goods_val
     *
     * @param goodsVal the value for jd_goods_attrval.goods_val
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setGoodsVal(String goodsVal) {
        this.goodsVal = goodsVal == null ? null : goodsVal.trim();
    }
}