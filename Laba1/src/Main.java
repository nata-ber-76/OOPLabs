
/*
@Author ASD Lab 1
Вариант лабораторной работы 6
a. Отсортируйте значения в массиве.
b. Дан массив чисел. Выведите их на печать, сдвигая положительные значения на 5 пробелов вправо.
c. Проверьте, отсортировано ли множество чисел в строке.
 */
public class Main
{   public static int[] sortmatr(int[] mass,char sortvalue)
    {   int temp;
        do {System.out.println("Введите значение сортировки 'A' для сортировки по возрастанию и 'D' по убыванию");
            System.out.println("Для этой лабораторной значение изначально задано и равно " + sortvalue);
            switch (sortvalue)
            {
                case 'a' :
                    { for (byte i =0; i<mass.length;i++)
                        {for (byte j=0;j<mass.length;j++)
                            {if(mass[i]<mass[j])
                                {   temp = mass[j];
                                    mass[j] = mass[i];
                                    mass[i] = temp;
                                }
                            }
                        }
                        break;
                    }
                case 'd' :
                    {for (byte i =0; i<mass.length;i++)
                        {for (byte j=0;j<mass.length;j++)
                            {if(mass[i]>mass[j])
                                {   temp = mass[j];
                                    mass[j] = mass[i];
                                    mass[i] = temp;
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
        } while(sortvalue!='a' && sortvalue!='d');
        return mass;
    }
    
    //тестовый текст для изменеинй 
    public static void ifmatrsort(int[] matr)
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
    public static void ifstringmatrsort(String initial)
    {   int[] matr;
        byte numbercount=0;
        String[] words;
        words = initial.split(" ");
        for (byte i = 0; i <words.length;i++)
        {if(tryParseInt(words[i]))  {numbercount++;}  }
        matr = new int[numbercount];
        byte k=0;
        for (byte i=0; i<words.length;i++)
        {if(tryParseInt(words[i]))
            {if(k<numbercount)
                {matr[k] = Integer.parseInt(words[i]);k++;}
            }
        }
        ifmatrsort(matr);
    }
    public static boolean tryParseInt (String value)
    {   try {Integer.parseInt(value);
             return true;}
        catch (NumberFormatException e )
        {return false;}
    }
    public static String matrToString (int[] matr)
    {   String text="";
        for (byte i =0;i<matr.length;i++)
        {   if(matr[i]>0)
            {text+= "     " +matr[i];}
            else text+= " " +matr[i];
        }
        return text;
    }
    public static void main(String[] args) {
        System.out.println("Вариант лабораторной работы 6\n" +
                "====================================\n"+
                "a. Отсортируйте значения в массиве.\n"+
                "====================================");
        int[] initialmatrix = new int[] {20,23,294,-41,643,-123,0,23};
        int[] secondmatrix; // ссылочные типы данных
        System.out.println("Первоначальные значения массива");
        for (int i =0; i<initialmatrix.length;i++)
        {System.out.print(initialmatrix[i] + " ");}
        secondmatrix = sortmatr(initialmatrix,'a');
        System.out.println("Отсортированные значения массива");
        for (int i =0; i<secondmatrix.length;i++)
        {System.out.print(secondmatrix[i] + " ");}
        System.out.println("\n====================================\n"+
                "b. Дан массив чисел. Выведите их на печать, сдвигая положительные значения на 5 пробелов вправо.\n"+
                "====================================");
        System.out.println(matrToString(initialmatrix));
        System.out.println("\n====================================\n"+
                "c. Проверьте, отсортировано ли множество чисел в строке.\n"+
                "====================================");
        String text = "Список годов с проверкой на сортировку : 1567 , 1620 , 1800 , 2000 проверка";
        System.out.println("Исходный текст \n"+text);
        ifstringmatrsort(text);
    }
}
