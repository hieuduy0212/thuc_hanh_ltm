/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_input_outout_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author DELLLTT5521
 */
public class ObjectInputOutputStream {

    public static void main(String[] args) {
        Card3 card = new Card3(12, Card3.SPADES);
        System.out.println("Card to write is: " + card);
        try {
            FileOutputStream out = new FileOutputStream("card.out");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(card);
            oos.flush();
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
        }
        try {
            FileInputStream in = new FileInputStream("card.out");
            ObjectInputStream ois = new ObjectInputStream(in);
            card = (Card3) (ois.readObject());
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
        }
        System.out.println("Card read is: " + card);
    }

}
