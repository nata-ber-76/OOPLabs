import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;

public class Menu {
    //Старый способ !!!!
    private static boolean tryParseInt (String value)//Внутренний метод проверяющий можно ли преобразовать строку в элемент массива
    {
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
        else {
            System.out.println("Ощибка введите заново : ");inputInt();
        }
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
                            "3 - Задать массив с помощью строки\n"+
                            "4 - Считать массив из файла");
        String choice;
        Exception exp = null;
        do{
            choice = input();
            switch(choice)
            {

                case "1":{
                    System.out.println("Введите длину");
                    int length=0;
                    do{
                        try {
                            length = inputInt();
                            vector = new Vector(length);
                            exp = null;
                        } catch(Exception e) {
                            exp=e;
                            System.out.println("Ошибка введите значение заново");

                        }
                    }while(exp !=null);
                    for (byte i = 0; i < vector.lenght; i++) {
                        System.out.print("Элемент "+ (i+1)+" = ");
                        vector.setEl(i,inputInt());
                        System.out.println();
                    }
                    break;}
                case "2":{
                    System.out.println("Введите длину");
                    int length=0;
                    do{
                        try {
                            length = inputInt();
                            vector = new Vector(length);
                            exp = null;
                        } catch(Exception e) {
                            exp=e;
                            System.out.println("Ошибка введите значение заново");

                        }
                    }while(exp !=null);
                    for (byte i = 0; i < vector.lenght; i++) {
                        System.out.print("Элемент " + (i + 1) + " = ");
                        vector.setEl(i, new Random().nextInt(200) - 100);
                        //System.out.print(vector.getEl(i));
                        System.out.println();
                    }
                    break;}
                case "3":{
                System.out.println("Введите строку чисел");
                vector = new Vector(input());
                    break;}
                case "4":{
                    do {
                        try(FileReader reader = new FileReader("vector.txt")){
                            String file="";
                            int c;
                            while ((c=reader.read())!=-1)
                            {
                                file += (char)c;
                            }
                            vector = new Vector(file);
                            exp = null;
                        } catch (IOException e){exp =e;System.out.println("Ошибка Чтения из файла");}
                    }while(exp!=null);
                    break;
                }
                default:{System.out.println("Введите значение заново");choice="0";}
            }
        }while(choice=="0");
        return vector;
    }
    public static void writeVector(Vector vector) throws  IOException
    {
        System.out.println("Вы хотите записать вектор в файл y-да , n-нет");
        String choice;
        do{
            choice=input();
            switch (choice)
            {
                case "y":
                    {
                    FileWriter writer = new FileWriter("vector.txt");
                    writer.write(vector.toString());
                    writer.flush();
                    break;
                    }
                case "n":
                {break;}
                default:{choice="";}
            }
        }while(choice=="");
    }

}

