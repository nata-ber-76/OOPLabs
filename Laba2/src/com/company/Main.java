package com.company;

import java.util.Random;

/*
@Author Lab 1
Вариант лабораторной работы 6
a. Отсортируйте значения в массиве.
b. Дан массив чисел. Выведите их на печать, сдвигая положительные значения на 5 пробелов вправо.
c. Проверьте, отсортировано ли множество чисел в строке.
Состояние и поведение обьекта
 */
public class Main {
    int i = 123;

    public static void main(String[] args) {
        Random random;
        System.out.println("Вариант лабораторной работы 6\n" +
                "====================================\n"+
                "a. Отсортируйте значения в массиве.\n"+
                "====================================");
        Vector first = new Vector();
        first.setEl((byte)2,-100);
        Vector second = new Vector();
        Vector third = new Vector(second);
        System.out.println("Первоначальные значения массива");
        first.ToPrint();
        System.out.println("Отсортированные значения массива");
        //second = first;
        second.SortMatr('a');
        second.ToPrint();
        third.ToPrint();
        System.out.println("\n====================================\n"+
                "b. Дан массив чисел. Выведите их на печать, сдвигая положительные значения на 5 пробелов вправо.\n"+
                "====================================");
        System.out.println("Первоначальный массив");
        first.ToPrint();
        System.out.println("Вывод массива со сдвигом");
        System.out.println(first.toString());
        System.out.println("\n====================================\n"+
                "c. Проверьте, отсортировано ли множество чисел в строке.\n"+
                "====================================");
        String text = "Список годов с проверкой на сортировку : 1567 , 1620 , 1800 , 2000 проверка";
        System.out.println("Исходный текст \n"+text);
        first = new Vector(text);
        first.GetSort();
        /*for (int i =0; i<secondmatrix.length;i++)
        {System.out.print(secondmatrix[i] + " ");}

        System.out.println(matrToString(initialmatrix));

        ifstringmatrsort(text);

                System.out.println();
	*/
    }
}
