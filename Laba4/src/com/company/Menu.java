package com.company;

import com.company.Print.Book;
import com.company.Print.Libary;

import java.io.*;

public class Menu {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Libary libary = new Libary();

    public static void Start() throws IOException
    {
        libary.addBook(new Book("Отцы и дети","192","Тургенев"));
        libary.addBook(new Book("Песнь льда и пламени","12341"));
        System.out.println("Добро пожаловать в библиотеку в данный момент количество книг : " + libary.getSizeofbook());
    }
}
