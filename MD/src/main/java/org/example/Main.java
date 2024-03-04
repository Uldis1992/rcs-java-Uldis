package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sveiki, Kāda šodien diena?");
        String name = sc.nextLine();

        String str = name;
        int len = str.length();
        System.out.println(len);

        if((len) > 5) {
            System.out.println("Programmēt ir forši");
        }
    }
}0