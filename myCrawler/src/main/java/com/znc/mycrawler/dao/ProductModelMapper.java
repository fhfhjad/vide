package com.znc.mycrawler.dao;

import com.znc.mycrawler.dao.util.BaseDao;
import com.znc.mycrawler.domain.ProductModel;
import com.znc.mycrawler.domain.ProductModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductModelMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int countByExample(ProductModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int deleteByExample(ProductModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int insert(ProductModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int insertSelective(ProductModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    List<ProductModel> selectByExample(ProductModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    ProductModel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int updateByExampleSelective(@Param("record") ProductModel record, @Param("example") ProductModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int updateByExample(@Param("record") ProductModel record, @Param("example") ProductModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int updateByPrimaryKeySelective(ProductModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_model
     *
     * @mbggenerated Sat Apr 25 13:33:15 CST 2015
     */
    int updateByPrimaryKey(ProductModel record);
}