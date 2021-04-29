package com.tanp.spring.demo7.service;

import com.tanp.spring.demo7.dao.BookDao;
import com.tanp.spring.demo7.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeBricklayer
 * @ClassName BookService
 * @Description
 * @date 2021/4/28 21:37
 */
@Service
public class BookService {

    /**
     * 注入BookDao
     */
    @Autowired
    private BookDao bookDao;

    /**
     * 添加的方法
     */
    public void addBook(Book book) {
        bookDao.add(book);
    }

    /**
     * 修改的方法
     */
    public void update(Book book) {
        bookDao.update(book);
    }

    /**
     * 删除的方法
     */
    public void delete(Integer id) {
        bookDao.delete(id);
    }

    /**
     * 查询表里面的记录条数
     */
    public int findCount() {
        return bookDao.selectCount();
    }

    /**
     * 查询返回对象
     */
    public void findBookById(Integer id) {
        bookDao.selectBookById(id);
    }

    /**
     * 查询返回集合
     */
    public void findAll() {
        bookDao.selectAll();
    }

    /**
     * 批量添加
     */
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAdd(batchArgs);
    }

    /**
     * 批量修改
     */
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }

    /**
     * 批量删除
     */
    public void batchDelete(List<Object[]> ids) {
        bookDao.batchDelete(ids);
    }
}
