
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class PersistentAnimation implements Serializable, Runnable{
    transient private Thread animator;
    private int animationSpeed;
    public PersistentAnimation(int animationSpeed){
        this.animationSpeed = animationSpeed;
        startAnimation();
    }
    public void run(){
        System.out.println("PersistentAnimation thread is started");
    }
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
    }
    private void readObject(ObjectInputStream in ) throws  IOException, ClassNotFoundException{
        in.defaultReadObject();
        startAnimation();
    }
    
    private void startAnimation(){
        animator = new Thread(this);
        animator.start();
    }
    
}
