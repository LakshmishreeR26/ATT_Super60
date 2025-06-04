import java.io.FileWriter;
import java.io.IOException;
public class WriteDataIntoTextFile {
    public static void main(String[] args)  throws IOException{
        FileWriter writer = new FileWriter("./Java/DSA/bnmit.txt",true);
        writer.append("\n We will learn and develop a simple app using Spring.");
        writer.append("\n We will learn Spring MVC in the third week.");
        writer.close();
        System.out.println("Successfully wrote  data into the file.");
    }
}
