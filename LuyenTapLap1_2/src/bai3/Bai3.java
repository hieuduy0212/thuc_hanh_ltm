/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author DELLLTT5521
 */
public class Bai3 {

    public static void main(String[] args) {
        String filename = "src/bai2/out.txt";

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            for (int i = 0; i < 100; i++) {
                bw.write(Integer.toString((int)(Math.random() * 100)));
                bw.write(" ");
            }
        } catch (Exception e) {
        }
    }
}
