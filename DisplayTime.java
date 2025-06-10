import java.time.LocalTime;

public class DisplayTime {
    public static void main(String[] args) {
        //LocalTime obj = LocalTime.now();
        LocalTime obj2 = LocalTime.now().minusMinutes(10);
        System.out.println("The date is:"+obj2);
    }
}
