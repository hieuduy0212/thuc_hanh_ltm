/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package random_access_file_handing;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author DELLLTT5521
 */
public class RandomAccessFileHanding {

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            raf.writeInt(10);
            raf.writeInt(43);
            raf.writeInt(88);
            raf.writeInt(455);
// change the 3rd integer from 88 to 99
            raf.seek((3 - 1) * 4);
            raf.writeInt(99);
            raf.seek(0); // go to the first integer
            int i = raf.readInt();
            while (i != -1) {
                System.out.println(i);
                i = raf.readInt();
            }
            raf.close();
        } catch (IOException e) {
        }
    }
}
