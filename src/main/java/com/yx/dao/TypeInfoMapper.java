package com.yx.dao;

import com.yx.po.TypeInfo;

public interface TypeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int insert(TypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int insertSelective(TypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    TypeInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int updateByPrimaryKeySelective(TypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int updateByPrimaryKey(TypeInfo record);
}