import java.util.*;

public class Large_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.println("Enter another nunber : ");
        int b = in.nextInt();

        if(a>b){
            System.out.println("The larger number is : " + a);
        }else{
            System.out.println("The larger number is : " + b);
        }
    }
}
