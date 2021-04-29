package com.tanp.spring.demo7.test;


import com.tanp.spring.demo7.entity.Book;
import com.tanp.spring.demo7.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CodeBricklayer
 * @ClassName BookTest
 * @Description
 * @date 2021/4/28 21:54
 */
public class BookTest {

    @Test
    public void testJdbcTemplateAdd() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId(3);
        book.setBookName("PHP");
        book.setStatus("b");
        bookService.addBook(book);
    }

    @Test
    public void testJdbcTemplateUpdate() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("Python");
        book.setStatus("bbc");
        bookService.update(book);
    }

    @Test
    public void testJdbcTemplateDelete() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.delete(1);
    }

    @Test
    public void testJdbcTemplateFindCount() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.findCount();
        System.out.println(count);
    }

    @Test
    public void testJdbcTemplateFindBookById() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.findBookById(2);
    }

    @Test
    public void testJdbcTemplateFindAll() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.findAll();
    }

    @Test
    public void testJdbcTemplateBatchAdd() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        for (int i = 4; i < 7; i++) {
            batchArgs.add(new Object[]{i, "test" + i, "1234"});
        }
        bookService.batchAdd(batchArgs);
    }

    @Test
    public void testJdbcTemplateBatchUpdate() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        for (int i = 4; i < 7; i++) {
            batchArgs.add(new Object[]{"update" + (i + 10), i + "a", i});
        }
        bookService.batchUpdate(batchArgs);
    }

    @Test
    public void testJdbcTemplateBatchDelete() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo7/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        for (int i = 4; i < 7; i++) {
            batchArgs.add(new Object[]{i});
        }
        bookService.batchDelete(batchArgs);
    }


}
