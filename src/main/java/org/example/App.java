/*
 *  UCF COP3330 Summer 2021 Assignment 3
 *  Copyright 2021 Steven Ortiz
 */


package org.example;

//What is the quote? These aren't the droids you're looking for.
//Who said it? Obi-Wan Kenobi
//Obi-Wan Kenobi says, "These aren't the droids you're looking for."


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {

        String name = readName();
        String Speaker = Person();

        String outputString = generateOutputString(name, Speaker);
        printOutput(outputString);

    }
    private static void printOutput(String outputString){
        System.out.println(outputString);
    }

    private static String readName(){
        System.out.print("What is the quote?");
        String name = in.nextLine();
        return name;
    }
    private static String Person() {
        System.out.print("Who said it?");
        String Speaker = in.nextLine();
        return Speaker;

    }

    private static String generateOutputString(String name, String Speaker) {


        return Speaker + " says, " + '"' + name + '"';
    }
}
