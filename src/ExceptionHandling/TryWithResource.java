package ExceptionHandling;

import java.io.*;

public class TryWithResource {
    public static void main(String [] args) {
        String filename = "src/files/testing.txt";
        testFile(filename);

        System.out.println("Current Working Directory (cwd) : "+ new File("").getAbsolutePath());

        for(File f : File.listRoots()) {
            System.out.println(f);
        }
        // checking file permissions
        System.out.println("Checking execute permission : " + new File(filename).canExecute());
        System.out.println("Checking read permission : " + new File(filename).canRead());
        System.out.println("Checking write permission : " + new File(filename).canWrite());
    }

    public static void testFile(String filename) {

        try(FileReader fileReader = new FileReader(filename); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

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
