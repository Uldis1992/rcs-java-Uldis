package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task2();
}

    public static void sample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki, ievadiet simbolu virkni");
        String input = sc.nextLine();
        String result = "Programmēšana";
        if (input.equals(result)) {
            System.out.println("Uzvarēji!");
        } else if (input.length() == result.length()) {
            System.out.println("Vienāds simbolu skaits");
        } else {
            System.out.println("Zaudēji!");

        }
    }


    private static void task2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki, lūdzu, Ievadiet skaitli:");

        int input = sc.nextInt();

        if((input >= 10) || (input <= 5)){
            System.out.println("$$");
        }else {
            System.out.println("$");

        }
    }
}
