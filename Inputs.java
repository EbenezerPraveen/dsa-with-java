import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;


public class Inputs {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        // System.out.print("Please enter your roll no.");
        // int rollno = input.nextInt();
        // System.out.println("Your roll no. is " + rollno);

        System.out.print("write you name : " );
        String name = take.nextLine();
        System.out.println(name);

        System.out.print("Write your marks : ");
        float marks = take.nextFloat();
        System.out.println(marks);
    }
}
