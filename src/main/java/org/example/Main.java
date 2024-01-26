package org.example;

import java.util.Scanner;
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число студентов - ");
        int num;
        num = sc.nextInt();
        System.out.println("Число студентов - " + num);
        sc.nextLine();
        File file = new File("example.txt");
        PrintWriter pw = new PrintWriter("PractJava1.txt");
        for (int i = 0; i < num; i++)
        {
            System.out.print("Введите имя студента ");
            String name;
            name = sc.nextLine();
            System.out.println("Имя студента - " + name);

            System.out.print("Введите возраст студента ");
            Integer age;
            age = sc.nextInt();
            System.out.println("Имя студента - " + age);


            System.out.print("Введите средний балл студента ");
            Double mark;
            mark = sc.nextDouble();
            System.out.println("Имя студента - " + mark);

            pw.println("Имя студента - " + name);
            pw.println("Возраст студента - " + age);
            pw.println("Имя студента - " + mark);
            sc.nextLine();
        }
        pw.close();
    }
}