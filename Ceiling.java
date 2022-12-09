public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target = 15;
        int ans = Binary_Sch(arr, target);
        System.out.println(ans);
    }

    static int Binary_Sch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the mid 
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else if(target>arr[arr.length-1]){
                return -1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
}
