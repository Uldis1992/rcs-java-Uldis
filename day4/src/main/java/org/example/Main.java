package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        public static void sample1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sveiki, ievadiet simbolu virkni");
            String input = sc.nextLine();
            String result = "Programmēšana";
            if (input.equals(result)) {
                System.out.println("Uzvarēji!");
            } else if (input.length() == result.length()) {
                System.out.println("Vienāds simbolu skaits");
            } else{
                System.out.println("Zaudēji!");
            }
        }
    }
