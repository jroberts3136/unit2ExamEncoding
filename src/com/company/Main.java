package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lineInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        boolean doneCode = false;

        int firstIndex;
        int lastIndex;

        String optionResponse;

        Code myCode;


        System.out.println("Enter your code.");
        myCode = new Code(lineInput.nextLine());

        while(!doneCode){

            System.out.println("Enter 1 if you would like to hide a section of your code. " +
                    "Enter 2 if you would like to recover a hidden section of your code. " +
                    "Enter 3 if you would like to see your code.");
            optionResponse = lineInput.nextLine();

            if (optionResponse.equals("1")){
                System.out.println("Enter the first index of the section of code you would like to hide.");
                firstIndex = intInput.nextInt();

                System.out.println("Enter the last index of the section of code you would like to hide.");
                lastIndex = intInput.nextInt();

                myCode.hide(firstIndex,lastIndex);
            }
            else if (optionResponse.equals("2")){
                System.out.println("Enter the first index of the section of code you would like to recover.");
                firstIndex = intInput.nextInt();

                System.out.println("Enter the last index of the section of code you would like to recover.");
                lastIndex = intInput.nextInt();

                myCode.recover(firstIndex,lastIndex);
            }
            else if (optionResponse.equals("3")){
                System.out.println(myCode.getCode());
            }
            else{
                System.out.println("That is not a valid option.");
            }

            System.out.println("Enter 1 to end the program. Enter anything else to continue.");
            optionResponse = lineInput.nextLine();
            if (optionResponse.equals("1")){
                doneCode = true;
            }

        }
    }
}
