package com.company.Print;

import java.util.ArrayList;

public class Libary {
    private ArrayList<ArrayList> libarylist = new ArrayList<>();
    private ArrayList<PrintEd> listofmagazine = new ArrayList<>();
    private ArrayList<PrintEd> listoftextbook = new ArrayList<>();
    private ArrayList<PrintEd> listofbook = new ArrayList<>();
    public Libary()
    {
        libarylist.add(listofmagazine);
        libarylist.add(listoftextbook);
        libarylist.add(listofbook);
    }
    public void addBook(Book book)
    {
        listofbook.add(book);
    }
    public void addMagazine(Magazine magazine)
    {
        listofmagazine.add(magazine);
    }
    public void addTextBook (Textbook textbook)
    {
        listoftextbook.add(textbook);
    }

    public int getSizeOfMagazine() {
        return listofmagazine.size();
    }
    public int getSizeOftextbook() {
        return listoftextbook.size();
    }

    public int getSizeofbook() {
        return listofbook.size();
    }

    public void printBooklist(){
        for (int i = 0; i < listoftextbook.size(); i++) {
            System.out.println(listofbook.get(i).toString());
        }
    }
    public void printMagazineList()
    {
        for (int i = 0; i < listoftextbook.size(); i++) {
            System.out.println(listofmagazine.get(i).toString());
        }
    }
    public void printTextbookList()
    {
        for (int i = 0; i < listoftextbook.size(); i++) {
            System.out.println(listoftextbook.get(i).toString());
        }
    }
    public void printLibaryList()
    {
        for(int i=0;i<getSizeofbook();i++)
        {
            System.out.println();
        }
    }
    public int getSizeOfLibarylist() {
        return listofbook.size()+listoftextbook.size()+listofmagazine.size();
    }
}
