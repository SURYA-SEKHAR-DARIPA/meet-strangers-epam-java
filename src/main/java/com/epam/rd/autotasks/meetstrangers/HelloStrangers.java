package com.epam.rd.autotasks.meetstrangers;
import java.util.*;

import java.io.IOException;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanNumber = new Scanner(System.in);
        int numberOfStrangers = scanNumber.nextInt();
        if (numberOfStrangers > 0) {
            for (int num = 1;num <= numberOfStrangers;num++) {
                Scanner scanName = new Scanner(System.in);
                String name = scanName.nextLine();
                System.out.println("Hello, " + name);
            }
        } else if (numberOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        
    }
}
}
