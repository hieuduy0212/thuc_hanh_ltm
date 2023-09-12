/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELLLTT5521
 */
public class ScannerClass {

    public static void main(String[] args) throws IOException {
        Scanner s
                = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")));
        s.useLocale(Locale.US);
        double sum = 0;
        while (s.hasNext()) {
            sum += s.nextDouble();
        }
        s.close();
        System.out.println("Sum of all numbers = " + sum);
    }
}
