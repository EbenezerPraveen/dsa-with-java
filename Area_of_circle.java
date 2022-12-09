import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = input.nextFloat();
        float area = 3.14f *r*r;
        System.out.println("Radius of the circle : " + area);
    }
}
