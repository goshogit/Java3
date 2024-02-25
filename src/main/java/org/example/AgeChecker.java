package org.example;


public class AgeChecker {
    public static void main(String[] args) {
        checkAge(20);
        checkAge(15);
        checkAge(17);



    }

    private static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Човекът е над 18 години");

        } else {
            System.out.println("Човекът е под 18 години");

        }
        if (age >= 19){
            System.out.println("Човекът е навършил 18 години");

        } else {
            System.out.println("не е пълнолетен");


            }
        }

    }




