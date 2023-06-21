package com.company;

public class Vector {

    //Переменные класса Vector

    public int[] matr;
    public final int lenght;

    //Конструкторы для класса Vector

    //Конструктор в котором не введены значения
    public Vector()
    {
         lenght = 5;
        matr = new int[] {13,23,-51,16,0};
    }
    //Конструктор с заданным размером
    public Vector(int Length)
    {
        lenght=Length;
        matr = new int[lenght];
    }
    //
    public Vector(Vector a)
    {
        lenght = a.lenght;
        matr = new int[a.matr.length];
        for (int i=0; i<matr.length;i++)
        {
            matr[i] = a.matr[i];
        }
    }
    //Конструктор создающий массив из строки
    public Vector(String initial)
    {
        byte numbrcount=0;
        String[] words = initial.split(" ");
        for (byte i =0;i<words.length;i++)
            if(tryParseInt(words[i])) numbrcount++;
         lenght=numbrcount;
         matr = new int[lenght];
         byte   k=0;
        for (byte i =0;i<words.length;i++)
        {
            if(tryParseInt(words[i]))
            {
                if(k<numbrcount) {
                    matr[k] = Integer.parseInt(words[i]); k++;
                }
            }
        }
    }

    //Методы класса Vector

    public void setEl(byte count,int value )
    {
        count--;
        matr[count] = value;
    }
//testfunction
    public void SortMatr(char sortvalue)//Метод для сортировки массива по ключу
    {   int temp;
        switch (sortvalue)
        {
            case 'a' :
            {
                for (byte i =0; i<matr.length;i++)
                {
                    for (byte j=0;j<matr.length;j++)
                    {   if(matr[i]<matr[j])
                    {   temp = matr[j];
                        matr[j] = matr[i];
                        matr[i] = temp;
                    }
                    }
                }
                break;
            }
            case 'd' :
            {
                for (byte i =0; i<matr.length;i++)
                {
                    for (byte j=0;j<matr.length;j++)
                    {
                        if(matr[i]>matr[j])
                        {   temp = matr[j];
                            matr[j] = matr[i];
                            matr[i] = temp;
                        }
                    }
                }
                break;
            }
            default:
            {   System.out.println("Ошибка! Введите правильное значение");
                break;
            }
        }
    }
    public void GetSort()//Проверяет является ли массив сортированным
    {   int ascendingcount = 1;
        int descendingcount =1;
        for (int i =0; i<matr.length-1; i++)
        {   if (matr[i]<matr[i+1]) ascendingcount++;
            if (matr[i]>matr[i+1]) descendingcount++;
        }
        if(ascendingcount == matr.length) System.out.println("Массив отсортирован по возрастанию");
        else if (descendingcount == matr.length) System.out.println("Массив отсортирован по убыванию");
        else System.out.println("Массив не отсортирован");
    }
    private boolean tryParseInt (String value)//Внутренний метод проверяющий можно ли преобразовать строку в элемент массива
    {   try {Integer.parseInt(value);
        return true;}
    catch (NumberFormatException e )
    {return false;}
    }
    public String toString ()//Метод возвращающий класс Vector строкой вида "положительные числа смещены на 5 пробелов вправо
    {   String text="";
        for (byte i =0;i<matr.length;i++)
        {   if(matr[i]>0)
        {text+= "     " +matr[i];}
        else text+= " " +matr[i];
        }
        return text;
    }
    public void ToPrint()// Метод печатающий массив
    {
        for (byte i=0;i<matr.length;i++)
        {
            System.out.print(matr[i]+" ");
        }
        System.out.println();
    }
}
