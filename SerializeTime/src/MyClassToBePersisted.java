
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class MyClassToBePersisted implements Serializable{
    static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String hobby;
    private String nameOfSchool;
    transient private int yearStarted;
    public MyClassToBePersisted(){
        name = "Nguyen duy hieu";
        age = 20;
        hobby = "game";
        nameOfSchool = "PTIT";
        yearStarted = 2020;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "MyClassToBePersisted{" + "name=" + name + ", age=" + age + ", hobby=" + hobby + ", nameOfSchool=" + nameOfSchool + ", yearStarted=" + yearStarted + '}';
    }

    
    
}
