package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek:");

        int number = scanner.nextInt();

        if (number >= 18)
        {
            System.out.println("Gratulacje ! Jesteś pełnoletni");
        }
        else
        {
            System.out.println("Niestety jesteś niepełnoletni");
        }
        System.out.println("Masz " + number + " lat.");
    }
}
