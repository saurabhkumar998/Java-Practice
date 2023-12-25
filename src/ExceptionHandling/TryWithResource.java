package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class TryWithResource {
    public static void main(String [] args) {
        String filename = "testing.txt";
        testFile(filename);
    }

    public static void testFile(String filename) {

        try(FileReader reader = new FileReader(filename)) {

        }catch(FileNotFoundException e) {
            System.out.println("The file "+ filename + " doesn't exist.");
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
