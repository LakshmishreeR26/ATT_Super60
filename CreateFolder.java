import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
        //Absolute Path -> Root Directory
        File folder = new File ("C:\\Users\\student\\Desktop\\BNM_DSJAVA_Training\\Java\\DSA");
        if(folder.mkdir()){
            System.out.println("Folder:"+folder.getName() + " created.");
        }
        else{
            System.out.println("Folder already exits.");
        }
    }
}
