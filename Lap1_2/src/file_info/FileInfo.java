/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_info;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DELLLTT5521
 */
public class FileInfo {

    public static void main(String[] args) {
// The first command line argument needs to be provided
        String fileName = "dummyname";
        File fn = new File(fileName);
        try {
            fn.createNewFile();
        } catch (IOException e) {
        }
        System.out.println("Name: " + fn.getName());
// Check if the file exists using exists() method
        if (fn.exists()) {
            System.out.println(fileName + " does exist.");
        }
        if (fn.canRead()) {
            System.out.println(fileName + " is readable.");
        }
        System.out.println(fileName + " is " + fn.length() + " bytes long.");
        System.out.println(fileName + " is last modifed at "
                + new java.util.Date(fn.lastModified()));
        if (fn.canWrite()) {
            System.out.println(fileName + " is writable.");
        } else {
            System.out.println(fileName + " is not writable.");
        }
    }

}
