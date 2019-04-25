package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Declare variables
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        Integer number = 0;
        String word = "";

        System.out.println("Enter a number: ");
        number = input.nextInt();
        input.nextLine();


        System.out.println("Is the key '10' present: " + map.containsKey(number));

        //Check in map that the key is in the map
        if (!map.containsKey(number)) {
            System.out.println("Please print a value to go with the key " +
                    number);
            word = input.nextLine();
        }
//enter the key and value in the Hashmap
        map.put(number, word);

        System.out.print("The value entered at " + number + " : " + map.get(number));

    }

    File file = new File();
    Scanner scannerInput = new Scanner(file);//note that Scanner can read from a file!
            while(scannerInput.hasNextLine())

    {
        String line = scannerInput.nextLine();
        System.out.println(line);
    }

}

