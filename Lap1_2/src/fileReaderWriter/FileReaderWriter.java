/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELLLTT5521
 */
public class FileReaderWriter {

    public static void main(String[] args) throws IOException{
        File inputFile = new File("farrago.txt");
        File outputFile = new File("outagain.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            System.out.println(c);
            out.write(c);
        }
        System.out.println("FileReader is used to read a file and FileWriter is used for writing.");
        in.close();
        out.close();
    }
}
