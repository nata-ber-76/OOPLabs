package com.company.Print;

public class Magazine extends PrintEd  {
    public Magazine(String name)
    {
        super(name);
    }
    public Magazine(String name,String year)
    {
        super(name,year);

    }
    public Magazine(String name,String year,String author)
    {
        super(name,year,author);
    }
    public Magazine(){
        super();
    }
    public String toString() {
        return "Журнал " + name + " под издательством " + author + " дата выпуска " + year;
    }
}
