/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELLLTT5521
 */
public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String filename = "src/bai2/out.txt";
        File file = new File(filename);
        if(!file.exists()) file.createNewFile();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(int i=0;i<100;i++){
                int ri = (int)(Math.random() * 100);
                bw.write(Integer.toString(ri));
                bw.write(" ");
            }
        }
    }
}
