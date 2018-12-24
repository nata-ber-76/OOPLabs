package com.company.Print;

public class Textbook extends PrintEd {
    public Textbook(String name)
    {
        super(name);
    }
    public Textbook(String name, String year)
    {
        super(name,year);

    }
    public Textbook(String name, String year, String author)
    {
        super(name,year,author);
    }
    public Textbook(){
        super();
    }
    public String toString() {
        return "Учебник " + name +" Написанный "+ author +" Дата публикации "+year;
    }
}
