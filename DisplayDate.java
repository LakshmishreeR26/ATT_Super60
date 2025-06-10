import java.time.LocalDate;

public class DisplayDate {
    public static void main(String[] args) {
        //LocalDate obj = LocalDate.now();
        LocalDate obj2 = LocalDate.now().minusDays(5);
        System.out.println("The date is:"+obj2);
    }
}
