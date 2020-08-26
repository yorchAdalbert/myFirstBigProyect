package yorchAdalbert.com;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Files {

    final static String filePath = "src/yorchAdalbert.com/students.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File(filePath));
        List<String> students = new ArrayList<>();

        /*while(input.hasNextLine())// this print the students names directly from the file.
            System.out.println(input.nextLine());*/

        while(input.hasNextLine())
            students.add(input.nextLine());

        for(String name : students)
            System.out.println("Name: " + name);

        input.close();

    }
}
