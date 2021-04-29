package com.tanp.spring.demo7.dao;

import com.tanp.spring.demo7.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author CodeBricklayer
 * @ClassName BookDaoImpl
 * @Description
 * @date 2021/4/28 21:37
 */
@Repository
public class BookDaoImpl implements BookDao {

    /**
     * 注入JdbcTemplate
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //调用方法实现
        Object[] args = {book.getBookId(), book.getBookName(), book.getStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set book_name=?,status=? where book_id=?";
        Object[] args = {book.getBookName(), book.getStatus(), book.getBookId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from t_book where book_id=?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.println(delete);
    }

    @Override
    public int selectCount() {
        String sql = "select count(book_id) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public void selectBookById(Integer id) {
        String sql = "select * from t_book where book_id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        System.out.println(book);
    }

    @Override
    public void selectAll() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        System.out.println(books);
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set book_name=?,status=? where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> ids) {
        String sql = "delete from t_book where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, ids);
        System.out.println(Arrays.toString(ints));
    }
}
