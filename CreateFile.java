import java.io.IOException;
import java.io.File;
public class CreateFile {
    public static void main(String[] args)  throws IOException {
        File file = new File("C:\\Users\\student\\Desktop\\BNM_DSJAVA_Training\\Java\\DSA\\bnmit.txt");
        if(file.createNewFile()) {
            System.out.println("File "+file.getName() + " created.");
        }
        else{
            System.out.println("Failed to create a file.");
        }
    }
}
