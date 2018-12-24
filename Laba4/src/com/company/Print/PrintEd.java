package com.company.Print;

public abstract class PrintEd {

    protected String year;
    protected String name;
    protected String author;
    //empty constructor
    public PrintEd()
    {
        this.author = "N/A";
        this.name = "N/A";
        this.year = "N/A";
    }

    //one value constructor
    public PrintEd(String Name)
    {
        this.year = "N/A";
        this.author = "N/A";
        this.name = name;
    }
    //two value constructor

    public PrintEd(String Name,String Year)
    {
         this.year = Year;
        this.name = Name;
        this.author = "N/A";
    }

    //three value constructor
    public PrintEd(String Name,String Year, String Author)
    {
        this.year = Year;
        this.name = Name;
        this.author = Author;
    }
    //methods
    // getMethods
    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
    //SetMethods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract method
    public abstract String toString();

}

