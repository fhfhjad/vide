package com.znc.jd.domain;

import java.io.Serializable;
import java.util.Date;

public class PProductImageGroup implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.image_groupid
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Long imageGroupid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.pid
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.standard_id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Long standardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.created_by
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.created_by_name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String createdByName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.created_time
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.modified_by
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.modified_by_name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private String modifiedByName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.modified_time
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_product_image_group.status
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.image_groupid
     *
     * @return the value of p_product_image_group.image_groupid
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Long getImageGroupid() {
        return imageGroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.image_groupid
     *
     * @param imageGroupid the value for p_product_image_group.image_groupid
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setImageGroupid(Long imageGroupid) {
        this.imageGroupid = imageGroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.name
     *
     * @return the value of p_product_image_group.name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.name
     *
     * @param name the value for p_product_image_group.name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.pid
     *
     * @return the value of p_product_image_group.pid
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.pid
     *
     * @param pid the value for p_product_image_group.pid
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.standard_id
     *
     * @return the value of p_product_image_group.standard_id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Long getStandardId() {
        return standardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.standard_id
     *
     * @param standardId the value for p_product_image_group.standard_id
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setStandardId(Long standardId) {
        this.standardId = standardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.created_by
     *
     * @return the value of p_product_image_group.created_by
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.created_by
     *
     * @param createdBy the value for p_product_image_group.created_by
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.created_by_name
     *
     * @return the value of p_product_image_group.created_by_name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.created_by_name
     *
     * @param createdByName the value for p_product_image_group.created_by_name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.created_time
     *
     * @return the value of p_product_image_group.created_time
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.created_time
     *
     * @param createdTime the value for p_product_image_group.created_time
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.modified_by
     *
     * @return the value of p_product_image_group.modified_by
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.modified_by
     *
     * @param modifiedBy the value for p_product_image_group.modified_by
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.modified_by_name
     *
     * @return the value of p_product_image_group.modified_by_name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public String getModifiedByName() {
        return modifiedByName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.modified_by_name
     *
     * @param modifiedByName the value for p_product_image_group.modified_by_name
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName == null ? null : modifiedByName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.modified_time
     *
     * @return the value of p_product_image_group.modified_time
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.modified_time
     *
     * @param modifiedTime the value for p_product_image_group.modified_time
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_product_image_group.status
     *
     * @return the value of p_product_image_group.status
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_product_image_group.status
     *
     * @param status the value for p_product_image_group.status
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}