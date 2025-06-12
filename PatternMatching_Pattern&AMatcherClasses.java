import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args){
        //Pattern pattern = Pattern.compile("core java", Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("core java", 2); //CASE_INSENSITIVE has a value that is equal to 2
        Matcher matcher = pattern.matcher("We are learning CORE JAVA");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if(matchFound){
            System.out.println("Correct Match");
        } else {
            System.out.println("Data Mismatch");
        }
    }
}
