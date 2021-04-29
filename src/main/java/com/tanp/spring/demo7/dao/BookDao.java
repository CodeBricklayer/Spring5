package com.tanp.spring.demo7.dao;

import com.tanp.spring.demo7.entity.Book;

import java.util.List;

public interface BookDao {
    /**
     * 添加的方法
     *
     * @param book
     */
    void add(Book book);

    /**
     * 更新的方法
     *
     * @param book
     */
    void update(Book book);

    /**
     * 删除的方法
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 查询表记录数
     */
    int selectCount();

    /**
     * 查询返回对象
     *
     * @param id
     */
    void selectBookById(Integer id);

    /**
     * 查询集合
     */
    void selectAll();

    /**
     * 批量添加
     *
     * @param batchArgs
     */
    void batchAdd(List<Object[]> batchArgs);

    /**
     * 批量更新
     *
     * @param batchArgs
     */
    void batchUpdate(List<Object[]> batchArgs);

    /**
     * 批量删除
     *
     * @param ids
     */
    void batchDelete(List<Object[]> ids);
}
