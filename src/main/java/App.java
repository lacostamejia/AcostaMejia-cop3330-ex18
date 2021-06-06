/*
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */



import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input;
        long F;
        long C;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        input = in.next();
        input = input.toUpperCase();

        if(input.equals("C")){

            System.out.print("Please enter the temperature in Fahrenheit: ");
            F = in.nextInt();
            C = Math.round((F - 32) * (0.55555555555));
            System.out.printf("The temperature in Celsius is %d.",C);
        }
        else if(input.equals("F")){

            System.out.print("Please enter the temperature in Celsius: ");
            C = in.nextInt();
            F = Math.round((C * (1.8)) + 32);
            System.out.printf("The temperature in Fahrenheit is %d.",F);

        }


    }
}
