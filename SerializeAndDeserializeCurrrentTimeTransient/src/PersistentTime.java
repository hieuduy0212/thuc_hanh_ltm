
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class PersistentTime implements Serializable{
    transient private Date time;
    transient private String myName;
    public PersistentTime(){
        time = Calendar.getInstance().getTime();
        myName = "Nguyễn Duy Hiếu";
    }
    public Date getTime(){
        return time;
    }
    public String getMyName(){
        return myName;
    }
}
