package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("asdfeedawdawdfdsafds");
//
//        int a = 6;
//
//        System.out.println(a);
//        a = 99;
//        System.out.println(a + 2);
//
//        String c = "Mani sauc Uldis";
//        System.out.println(c);

        System.out.println("ievadiet savu vārdu");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Sveiki, " + name + "!");

    }
}