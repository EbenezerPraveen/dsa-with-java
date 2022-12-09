public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
        
    }


    public static void main(String[] args) {
        int[] nums = {18,12,9,14,77,50};
        int t = 100;   //target needed to be searched 
        System.out.print(linearSearch(nums,t));
    }

    
}
