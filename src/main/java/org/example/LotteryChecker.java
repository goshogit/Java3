package org.example;

public class LotteryChecker {
    public static void main(String[] args) {

        checkText("Lottery");

    }

    public static void checkText(String text) {
        if (text.equals("Lottery")) {
            System.out.println("Вие печелите голямата награда");

        } else {
            System.out.println("Опитайте пак!");

            }
        }
    }
