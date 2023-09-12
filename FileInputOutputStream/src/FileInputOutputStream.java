
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class FileInputOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File inputFile = new File("farrago.txt");
        File outputFile = new File("outagain.txt");
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            System.out.println(c);
            out.write(c);
        }
        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");
        in.close();
        out.close();
    }

}
