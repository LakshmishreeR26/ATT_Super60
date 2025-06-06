import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] duplicateData ={"Java","Python","SQL","Python","Java","C++","SQL"};
        Set<String>  uniqueData = new LinkedHashSet<>();
        for(String str : duplicateData){
            uniqueData.add(str);
        }
        //System.out.println("After removing duplicates: "+uniqueData);
        //Lambda expression
        uniqueData.forEach(x->System.out.println(x));
    }
}
