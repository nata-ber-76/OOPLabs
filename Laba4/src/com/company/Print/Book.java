package com.company.Print;

public class Book extends PrintEd {
    private String numberofpages = "0";

    public Book(String name)
    {
        super(name);
    }
    public Book(String name,String year)
    {
        super(name,year);

    }
    public Book (String name,String year,String author)
    {
        super(name,year,author);
    }
    public Book(){
        super();
    }
    public Book (String name, String year, String author, String numberofpages)
    {
        super(name,year,author);
        this.numberofpages = numberofpages;
    }
    public String getNumberofpages() {
        return numberofpages;
    }
    public void setNumberofpages(String numberofpages) {
        this.numberofpages = numberofpages;
    }
    public String toString()
    {
     return "Книга" +name + " под авторством " + author +" написанна в " + year +" кол-во страниц " + numberofpages;
    }
}
