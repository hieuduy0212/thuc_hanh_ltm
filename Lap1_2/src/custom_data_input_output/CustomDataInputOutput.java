/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom_data_input_output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DELLLTT5521
 */
public class CustomDataInputOutput {

    public static void main(String[] args) throws IOException {
        Adler32 inChecker = new Adler32();
        Adler32 outChecker = new Adler32();
        CheckedDataInput in = null;
        CheckedDataOutput out = null;
        try {
            in = new CheckedDataInput(
                    new DataInputStream(new FileInputStream("farrago.txt")), inChecker);
            out = new CheckedDataOutput(
                    new DataOutputStream(new FileOutputStream("outagain.txt")), outChecker);
        } catch (FileNotFoundException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        } catch (IOException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        }
        boolean EOF = false;
        while (!EOF) {
            try {
                int c = in.readByte();
                out.write(c);
            } catch (EOFException e) {
                EOF = true;
            }
        }
        System.out.println("Input stream check sum: "
                + in.getChecksum().getValue());
        System.out.println("Output stream check sum: "
                + out.getChecksum().getValue());
    }
}
