package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public static void cw_1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadiet skaitli:");

            int number = sc.nextInt();
            int fact = 1;

            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Skaitļa "+ number + " faktoriāls ir "+ fact);
        }
    }
p