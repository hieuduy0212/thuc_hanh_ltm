/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filter_input_output_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DELLLTT5521
 */
public class FilterInputOutputStream {

    public static void main(String[] args) throws IOException {
        Adler32 inChecker = new Adler32();
        Adler32 outChecker = new Adler32();
        CheckedInputStream in = null;
        CheckedOutputStream out = null;
        try {
            in = new CheckedInputStream(
                    new FileInputStream("farrago.txt"),
                    inChecker);
            out = new CheckedOutputStream(
                    new FileOutputStream("outagain.txt"),
                    outChecker);
        } catch (FileNotFoundException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        } catch (IOException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        }
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        System.out.println("Input stream check sum: "
                + inChecker.getValue());
        System.out.println("Output stream check sum: "
                + outChecker.getValue());
        in.close();
        out.close();
    }

}
