import java.util.*;
public class Car{
    String brandname;
    int manudate;

    Car(String brandname,int manudate)
    {
        this.brandname = brandname;
        this.manudate = manudate;
    }
    void details()
    {
        System.out.println("Car brandname:"+this.brandname);
        System.out.println("Car manufacture data :"+this.manudate);
    }
    public static void main(String args[]){
        Car c1 = new Car("Audi",1995);
        Car c2 = new Car("Merced", 2000);
        c1.details();
        c2.details();
    }
}
