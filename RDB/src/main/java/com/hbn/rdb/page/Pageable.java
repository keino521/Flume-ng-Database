package com.hbn.rdb.page;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Time;
import java.util.Calendar;

/**
 * @author wangheng
 * @create 2019-03-07 上午9:55
 * @desc
 **/
public interface Pageable extends ResultSet {


    /**返回总页数
     */
    int getPageCount();
    /**返回当前页的记录条数
     */
    int getPageRowsCount();
    /**返回分页大小
     */
    int getPageSize();
    /**转到指定页
     */
    void gotoPage(int page) ;
    /**设置分页大小
     */
    void setPageSize(int pageSize);
    /**返回总记录行数
     */
    int getRowsCount();
    /**
     * 转到当前页的第一条记录
     * @exception java.sql.SQLException 异常说明。
     */
    void pageFirst() throws java.sql.SQLException;
    /**
     * 转到当前页的最后一条记录
     * @exception java.sql.SQLException 异常说明。
     */
    void pageLast() throws java.sql.SQLException;
    /**返回当前页号
     */
    int getCurPage();

}






