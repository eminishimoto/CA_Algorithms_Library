/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author emi
 */
public class Book implements Comparable {  //data = MOCK_DATA.csv

    // attribute
    private String bookid;
    private String author_first_name;
    private String author_last_name;
    private String book_title;
    private boolean avairable;

    //def  constructor
    public Book() {
    }

    //constructor
    public Book(String bookid, String author_first_name, String author_last_name, String book_title) {
        this.bookid = bookid;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.book_title = book_title;
        this.avairable = true;//at first all avairable

    }

    //method
    public boolean isAvairable() {
        return avairable;
    }

    public String getBookid() {
        return bookid;
    }

    public String getId() {
        return bookid;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public String getAuthor_Fullname() {
        return author_first_name + " " + author_last_name;
    }

    public String getBook_title() {
        return book_title;
    }

    @Override
    public String toString() {
        return "Book{" + "bookid=" + bookid + ", author_first_name=" + author_first_name + ", author_last_name=" + author_last_name + ", book_title=" + book_title + '}';
    }

    public String showBookInfo() {
        return "\nBook info : " + "bookid=" + bookid + ", author_first_name=" + author_first_name + ", author_last_name=" + author_last_name + ", book_title=" + book_title;
    }

    public String toStringBookTitle() {
    return book_title;
    }
    
    @Override
    public int compareTo(Object o) {
        return this.book_title.compareTo(o.toString());
    }

}
