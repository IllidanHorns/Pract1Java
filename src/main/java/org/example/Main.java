package org.example;

import java.util.Scanner;
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число студентов - ");
        int num; // Создаим переменную-счётчик, определяющую о скольких студентов нужно взять информацию
        num = sc.nextInt(); // Считываем значение введённое пользователем
        System.out.println("Число студентов - " + num);
        sc.nextLine();
        PrintWriter pw = new PrintWriter("PractJava1.txt"); // Создадим специальный объект, отвечающий за обращение для записи в файл данных
        for (int i = 0; i < num; i++)
        {
            System.out.print("Введите имя студента ");
            String name;
            name = sc.nextLine(); //Считываем данные пользователя о имени студента
            System.out.println("Имя студента - " + name);

            System.out.print("Введите возраст студента ");
            Integer age;
            age = sc.nextInt(); //Считываем данные пользователя о возрасте студента
            System.out.println("Имя студента - " + age);


            System.out.print("Введите средний балл студента ");
            Double mark;
            mark = sc.nextDouble(); //Считываем данные пользователя о среднем балле студента
            System.out.println("Имя студента - " + mark);

            pw.print("Имя студента - " + name + " "); // Записываем данные в файл (Каждая строчка - информация о одном студенте)
            pw.print("Возраст студента - " + age + " ");
            pw.print("Имя студента - " + mark + " ");
            pw.println(""); // Для того, чтобы всё полностью не писалось в одну строчку напишим специальный раздилитель
            sc.nextLine(); // Отчистим буфер от старых данных переменных
        }
        pw.close(); // Закроем поток
    }
}