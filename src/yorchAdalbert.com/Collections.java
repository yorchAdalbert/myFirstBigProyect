package yorchAdalbert.com;

import java.util.Scanner;

public class Collections {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] grades;

        System.out.print("Enter the array's size:\n> ");
        int size = input.nextInt();

        grades = new int[size];

        System.out.println("Enter the grade and enter to go on");
        for(int i = 0; i < size; i++)
            grades[i] = input.nextInt();

        input.close();

        System.out.println("\nThis are the grades that entered");
        for(int i = 0; i < size; i++)
            System.out.println(grades[i]);

    }
}
