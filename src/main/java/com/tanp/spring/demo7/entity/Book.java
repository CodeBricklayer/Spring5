package com.tanp.spring.demo7.entity;

/**
 * @author CodeBricklayer
 * @ClassName User
 * @Description
 * @date 2021/4/28 21:44
 */
public class Book {
    private Integer bookId;

    private String bookName;

    private String status;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
