package filehandling;

import java.io.File;
import java.io.IOException;

public class Handling {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("mano.txt");
            if (myObj.createNewFile()) {
                System.out.println("File Created " + myObj.getName());
            } else {
                System.out.println("File Already Exists.");
            }

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
