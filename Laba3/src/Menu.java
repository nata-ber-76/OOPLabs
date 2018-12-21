import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;

public class Menu {
    //Старый способ
    private static boolean tryParseInt (String value)//Внутренний метод проверяющий можно ли преобразовать строку в элемент массива
    {
        System.out.print(value);System.out.print(value);
        try {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e )
        {return false;}
    }
    private static int inputInt() throws  IOException
    {   int i=0;
        String number = input();
        if (tryParseInt(number))
        {
            i = Integer.parseInt(number);
        }
        System.out.println("number transform = "+i);
        return i;
    }
    // новый метод
    public static String input() throws IOException
    {
        String text = "";
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        text = stdin.readLine();
        return text;
    }
    public static Vector createVector (Vector vector) throws IOException
    {
        System.out.println("Выберите метод создание вектора \n" +
                            "1 - Задать длину массива и потом определить числа\n" +
                            "2 - Задать длину с рандомно-генерируемыми элементами\n" +
                            "3 - Задать массив с помощью строки");
        String choice;
        do{
            choice = input();
            switch(choice)
            {
                case "1":{
                    System.out.println("Введите длину");
                    int length=0;
                    do {
                        System.out.println("Ошибка введите длину больше 0");
                        length = inputInt();
                    } while(length<0);
                    vector = new Vector(length);
                    for (byte i = 0; i < vector.lenght; i++) {
                        System.out.print("Элемент "+ (i+1)+" = ");
                        vector.setEl(i,inputInt());
                        System.out.println();
                    }
                }break;
                case "2":{
                    System.out.println("Введите длину");
                    int length=0;
                    do {
                        System.out.println("Ошибка введите длину больше 0");
                        length = inputInt();
                    } while(length<0);
                    vector = new Vector(length);
                    for (byte i = 0; i < vector.lenght; i++) {
                        System.out.print("Элемент " + (i + 1) + " = ");
                        vector.setEl(i, new Random().nextInt(200) - 100);
                        System.out.print(vector.getEl(i));
                        System.out.println();
                    }
                }break;
                case "3":{
                System.out.println("Введите строку чисел");
                int length=0;
                do {
                    System.out.println("Ошибка введите длину больше 0");
                    length = inputInt();
                } while(length<0);
                vector = new Vector(length);
                }break;
                default:{System.out.println("Введите значение заново");choice="0";}
            }
        }while(choice=="0");
        return vector;
    }

}

