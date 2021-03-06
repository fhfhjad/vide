package com.znc.jd.dao;

import com.znc.jd.dao.util.BaseDao;
import com.znc.jd.domain.PProductImageGroup;
import com.znc.jd.domain.PProductImageGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PProductImageGroupMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int countByExample(PProductImageGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int deleteByExample(PProductImageGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int deleteByPrimaryKey(Long imageGroupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int insert(PProductImageGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int insertSelective(PProductImageGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    List<PProductImageGroup> selectByExample(PProductImageGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    PProductImageGroup selectByPrimaryKey(Long imageGroupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PProductImageGroup record, @Param("example") PProductImageGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int updateByExample(@Param("record") PProductImageGroup record, @Param("example") PProductImageGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int updateByPrimaryKeySelective(PProductImageGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_product_image_group
     *
     * @mbggenerated Mon Jan 18 10:40:03 CST 2016
     */
    int updateByPrimaryKey(PProductImageGroup record);
}