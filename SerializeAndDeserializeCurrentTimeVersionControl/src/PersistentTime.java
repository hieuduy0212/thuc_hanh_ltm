import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class PersistentTime implements Serializable{
    static final long serialVersionUID = -3126998878902358595L;
    private Date time;
    private String aNewField;
    private String myName;
    public PersistentTime(){
        time = Calendar.getInstance().getTime();
        this.myName = "Nguyễn Duy Hiếu";
    }
    public Date getTime(){
        return time;
    }
    public Long getID(){
        return serialVersionUID;
    }
    public String getMyName(){
        return this.myName;
    }
}
