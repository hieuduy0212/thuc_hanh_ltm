
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELLLTT5521
 */
public class DeserializeTime {

    public static void main(String[] args) {
        String filename = "time.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        // Deserialize the previously saved
        // PersistentTime object instance
        PersistentTime time = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);

            time = (PersistentTime) in.readObject();
            in.close();

        } catch (IOException | ClassNotFoundException ex) {
        }
        System.out.println("My name is: " + time.getMyName());
        System.out.println("Previously serialized time: " + time.getTime());
        System.out.println("Current time: " + Calendar.getInstance().getTime());
    }
}
