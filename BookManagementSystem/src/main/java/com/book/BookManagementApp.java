package com.book.main;

import com.book.dao.BookDao;
import com.book.model.Book;

import java.beans.JavaBean;
import java.util.Scanner;

public class BookManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookDao dao = new BookDao();

        System.out.println("===== Book Management System =====");

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);

        dao.addBook(book);
    }

}
