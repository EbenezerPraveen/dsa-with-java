public class Minimum_element_Searching {
    public static void main(String[] args) {
      int[] arr = {5,7,4,9,2};
      System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
        
    }
}
