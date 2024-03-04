package org.example;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ievadiet savu vardu");
        String name = sc.nextLine();
        System.out.println("Sveiki, " + name + "!");

        System.out.println("ievadiet savu dzimšanas gadu");
        int vecums = sc.nextInt();
        System.out.println("Tev ir " + (2024 - vecums) + " gadi.");

        System.out.println( name + ", Ievadiet 1. skaitli");

        int skaitlis1 = sc.nextInt();

        System.out.println("Ievadiet 2. skaitli");

        int skaitlis2 = sc.nextInt();

        System.out.println("Skaitļu summa ir " + (skaitlis1 + skaitlis2) + ", Skaitļu starpība ir " + (skaitlis2 - skaitlis1));

        if((skaitlis1 + skaitlis2) > 0){
            System.out.println("+");
        }else if((skaitlis1 + skaitlis2) < 0){
            System.out.println("-");

        double a = 3.4;


//        Scanner sc = new Scanner(System.in);

//        int number = sc.nextInt();
//        System.out.println("Ievadiet skaitli");
//
//        if(number > 1){
//            System.out.println("+");
//        }else if(number ==5){
//            System.out.println("!!");
//        }else{
//            System.out.println("#");
        }

    }
}
