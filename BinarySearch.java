public class BinarySearch {
    public static void main(String[] args) {
      int[] arr={2,3,4,5,6,7,8,9,10};
      int target = 7;
      int ans=binsch(arr,target);  
      System.out.println(ans);
    }

    static int binsch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the mid 
            int mid = start +(end-start)/2;  //enhances way of start+end/2
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
