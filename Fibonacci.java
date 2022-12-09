import java.util.*;

//Method 1 ---- Iterative 

class FibonacciExample{
    public static void main(String[] args) {
        
        
        // int n1 = 0;
        // int n2 = 1;
        // int n3;
        // int i ;
        // int count = 10;
        
        // System.out.print(n1+" "+n2);// printing 0 and 1 

        // for(i=2;i<count;++i){
        //     n3 = n2 + n1 ;
        //     System.out.print(" "+n3);
        //     n1=n2;
        //     n2=n3;



        // }



            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int p = 0;
            int i = 1;
            int count = 2;

            while(count<=n){
                int temp = i;
                i=i+p;
                p = temp;
                count++;

            }
            System.out.println(i);
    }
}