
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class SerializeAnimationThreadNotStarted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersistentAnimation a = new PersistentAnimation(1);

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream("serializedfile");
            out = new ObjectOutputStream(fos);
            out.writeObject(a);
            out.close();

        } catch (IOException e) {
        }

        PersistentAnimation b = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream("serializedfile");
            in = new ObjectInputStream(fis);
            b = (PersistentAnimation)in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
        }
         
    }

}
