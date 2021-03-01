package com.xxjsmile.bean;


//import com.xxjsmile.bean.*;

import com.xxjsmile.bean.*;
import com.xxjsmile.bean.book.Book;
//import com.xxjsmile.bean.money.Money;

//import java.sql.Timestamp;

public class TestJdk9 {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        Book book = new Book();
        book.read();


        /*Money money = new Money();
        money.pay();*/
        /*java.sql.Timestamp.class
        System.out.println(Timestamp.class);*/


    }
}
