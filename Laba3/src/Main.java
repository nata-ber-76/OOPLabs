import java.util.Random;
/* пример !!!!!!*/
import java.io.*;

public class Main {
    int i = 123;
    public static void main(String[] args) {
        Random random;
        int i;
        DataInputStream a = new DataInputStream(System.in);
        System.out.println("Вариант лабораторной работы 6\n" +
                "====================================\n" +
                "a. Отсортируйте значения в массиве.\n" +
                "====================================");
        Vector first = new Vector();
        try {
        first = Menu.createVector(first);

        }
        catch (IOException e){}
        System.out.println("Первоначальные значения массива");
        first.ToPrint();
        System.out.println("Выберите вид сортировки 'a' - для сортировки по убыванию, 'd'- по возрастанию");
        Vector second = new Vector(first);
        try { String ch = Menu.input();
            do{second.SortMatr(ch);}
            while (ch=="a"||ch=="d");
        } catch (IOException e){}
        System.out.println("Отсортированные значения массива");
        second.ToPrint();
        System.out.println("\n====================================\n" +
                "b. Дан массив чисел. Выведите их на печать, сдвигая положительные значения на 5 пробелов вправо.\n" +
                "====================================");
        System.out.println("Первоначальный массив");
        first.ToPrint();
        System.out.println("Вывод массива со сдвигом");
        System.out.println(first.toString());
        System.out.println("\n====================================\n" +
                "c. Проверьте, отсортировано ли множество чисел в строке.\n" +
                "====================================");
        String text = "";
        try{ text = Menu.input();} catch (IOException e){}
        System.out.println("Исходный текст \n" + text);
        first = new Vector(text);
        first.GetSort();
        try {
            Menu.writeVector(first);
        } catch (IOException e){}

    }
}