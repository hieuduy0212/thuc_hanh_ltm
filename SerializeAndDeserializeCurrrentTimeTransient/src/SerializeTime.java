
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;


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
        if(args.length > 0){
            filename = args[0];
        }
        
        PersistentTime time = new PersistentTime();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
