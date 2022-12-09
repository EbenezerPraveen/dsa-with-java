public class Maxwealth {
    public static void main(String[] args) {
        
    }
            

    


    public int MaximumWealth(int[][] accounts){
        // person=row
        // account=col
        int ans = Integer.MIN_VALUE;
        for(int[] ints: accounts){
            //When you start a new column, take a new sum for that row 
            int sum = 0 ;
            for(int anInt : ints){
                sum += anInt;
            }
            //now we have sum of accounts of a person 
            //check with the overall ans
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
