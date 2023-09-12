
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class SerializeAnimation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "serializedfile";
        
        FileOutputStream fos = null;
        ObjectOutputStream out =null;
        PersistentAnimation a = new PersistentAnimation(1);
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(a);
            out.close();
            
        } catch (Exception e) {
        }
        
        FileInputStream fis = null;
        ObjectInputStream in = null;
        PersistentAnimation b = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            b = (PersistentAnimation) in.readObject();
            in.close();
            
        } catch (Exception e) {
        }
        
    }
    
}
