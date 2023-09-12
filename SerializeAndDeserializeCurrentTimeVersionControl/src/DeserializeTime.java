
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
        FileInputStream fis = null;
        ObjectInputStream in = null;
        PersistentTime time = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            time = (PersistentTime) in.readObject();
            System.out.println("id: " + time.getID());
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Previously time: " + time.getTime() + ", my name is: " + time.getMyName()) ;
        System.out.println("Current time: " + Calendar.getInstance().getTime());
    }
}
