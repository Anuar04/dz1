package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String namemAnuar;
        final int NUM = -12;
        String word = "Привет";
        namemAnuar = NUM + word;
        System.out.println(NUM + "" + word + "" + namemAnuar);
        if (NUM < 0) {
            System.out.println("вы сохранили отрецателная число");
        }
        else if (NUM >= 0 ) {
            System.out.println("вы сохранили положительное число");
        } else {
            System.out.println("вы сохранили ноль");

        }


        //dop
        Scanner scanner = new Scanner(System.in);

        System.out.println("привет"+""+scanner.nextLine());

    }
}

