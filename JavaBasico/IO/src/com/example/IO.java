package com.example;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
    public static void main (String[] args) {
        try {
            InputStream file = new FileInputStream("text.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(file);

            boolean ok = false;

            try {

                do {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Mete dos números:");
                    scanner.reset();

                    try {
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();

                        System.out.println("Números: " + a + " " + b);

                        ok = true;
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                } while (! ok);


                // byte[] data = file.readAllBytes();
                // for (byte item : data) System.out.println((char)item);

                // byte[] allData = new byte[5];
//                int data = fileBuffer.read();
//
//                while (data != - 1) {
//                    // EOF (end of file)
//                    System.out.print((char) data);
//                    data = fileBuffer.read();
//                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
