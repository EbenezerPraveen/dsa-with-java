public class Even_number_digits {
    public static void main(String[] args) {
        int[] nums = {34,567,8945,2,3456};

        System.out.println(FindNummbers(nums));
    }


    // Function to find the number of digits in an integer 
    static int digits(int num){
        int count = 0;
        // while(num>0){
        //     num = num / 10;
        //     count++;
            
        // }
        // return count;
        return (int)(Math.log10(num))+1;
    }


    // Function to check wether the number of digits in an integer is even or not 
    static boolean even(int num){
        int numberOfdigits = digits(num);
        return numberOfdigits % 2 == 0;
    }


    // Function to count the number of integers with even number of digits in an given array
    static int FindNummbers(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    } 
}
