
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
public class SerializeTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "time.ser";
        if (args.length > 0) {

            filename = args[0];
        }
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        PersistentTime time = new PersistentTime();
System.out.println("id: " + time.getID());
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();

        } catch (IOException e) {
        }
    }

}
