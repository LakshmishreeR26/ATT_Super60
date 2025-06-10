import java.time.LocalDateTime;

public class DisplayDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfYear()+" ");
    }
}
