package com.book.dao;

import com.book.model.Book;
import com.book.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDao {
    public void addBook(Book book) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO books(title, author,price) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book Added Successfully");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}