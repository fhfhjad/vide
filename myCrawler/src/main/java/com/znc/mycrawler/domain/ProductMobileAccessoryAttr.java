package com.znc.mycrawler.domain;

import java.io.Serializable;

public class ProductMobileAccessoryAttr implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_mobile_accessory_attr.id
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_mobile_accessory_attr.pmaid
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    private String pmaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_mobile_accessory_attr.attribute_name
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    private String attributeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_mobile_accessory_attr.attribute_value
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    private String attributeValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_mobile_accessory_attr.classfiy_code
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    private String classfiyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_mobile_accessory_attr
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_mobile_accessory_attr.id
     *
     * @return the value of product_mobile_accessory_attr.id
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_mobile_accessory_attr.id
     *
     * @param id the value for product_mobile_accessory_attr.id
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_mobile_accessory_attr.pmaid
     *
     * @return the value of product_mobile_accessory_attr.pmaid
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public String getPmaid() {
        return pmaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_mobile_accessory_attr.pmaid
     *
     * @param pmaid the value for product_mobile_accessory_attr.pmaid
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public void setPmaid(String pmaid) {
        this.pmaid = pmaid == null ? null : pmaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_mobile_accessory_attr.attribute_name
     *
     * @return the value of product_mobile_accessory_attr.attribute_name
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_mobile_accessory_attr.attribute_name
     *
     * @param attributeName the value for product_mobile_accessory_attr.attribute_name
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_mobile_accessory_attr.attribute_value
     *
     * @return the value of product_mobile_accessory_attr.attribute_value
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_mobile_accessory_attr.attribute_value
     *
     * @param attributeValue the value for product_mobile_accessory_attr.attribute_value
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue == null ? null : attributeValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_mobile_accessory_attr.classfiy_code
     *
     * @return the value of product_mobile_accessory_attr.classfiy_code
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public String getClassfiyCode() {
        return classfiyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_mobile_accessory_attr.classfiy_code
     *
     * @param classfiyCode the value for product_mobile_accessory_attr.classfiy_code
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    public void setClassfiyCode(String classfiyCode) {
        this.classfiyCode = classfiyCode == null ? null : classfiyCode.trim();
    }
}