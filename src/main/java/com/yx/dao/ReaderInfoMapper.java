package com.yx.dao;

import com.yx.po.ReaderInfo;

public interface ReaderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int insert(ReaderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int insertSelective(ReaderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    ReaderInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int updateByPrimaryKeySelective(ReaderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbggenerated Tue Mar 30 10:51:15 CST 2021
     */
    int updateByPrimaryKey(ReaderInfo record);
}