
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class DeserializeMyClassToBePersisted {
    public static void main(String[] args) {
        for(String s : args){
            System.out.println(s);
        }
        String filename = "exercise.ser";
//        if(args.length > 0) {
//            filename = args[0];
//        }
        FileInputStream fis = null;
        ObjectInputStream in = null;
        MyClassToBePersisted a = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            a =(MyClassToBePersisted)in.readObject();
            System.out.println(a.toString());
            in.close();
            
        } catch (IOException | ClassNotFoundException e) { 
            e.printStackTrace();
        }
        
    }
}
