/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELLLTT5521
 */
public class Bai1 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        String filename1 = "", filename2 = "";
        System.out.print("Enter file name 1: "); filename1 = sc.nextLine();
        System.out.print("Enter file name 2: "); filename2 = sc.nextLine();
        
        String content1 = readAll(filename1);
        String content2 = readAll(filename2);
        if(content1.equals(content2)){
            System.out.println("The content of the two files are the same");
        }else{
            System.out.println("The content of the two files aren't the same");
        }
    }
    public static String readAll(String filename) throws FileNotFoundException, IOException{
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
}

