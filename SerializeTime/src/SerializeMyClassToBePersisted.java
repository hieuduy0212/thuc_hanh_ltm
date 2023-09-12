
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class SerializeMyClassToBePersisted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "exercise1.ser";
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        MyClassToBePersisted a = new MyClassToBePersisted();
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(a);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
