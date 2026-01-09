import java.time.LocalDate;

public class User {
    protected String Name;
    protected LocalDate dob;

    public User(){
        this.Name=null;
        this.dob=LocalDate.now();
    }

    public User(String n,int y,int m,int d){
        this.Name=n;
        this.dob=LocalDate.of(y,m,d);
    }
    public void displayInfo(){
        System.out.println("Name:"+this.Name);
        System.out.println("Dob:"+this.dob);
    }
}
