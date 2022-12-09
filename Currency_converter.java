import java.util.Scanner;

public class Currency_converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter money in Rupees : ");
        float rupee = in.nextFloat();
        
        float usd = rupee * (float)(0.013);

        System.out.println("In USD is : " + usd);
    }
}
