import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader reader = new FileReader(file);
            // Perform some operations with the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

//output
//File not found: example.txt (No such file or directory)