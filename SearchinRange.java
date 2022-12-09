public class SearchinRange {
    public static void main(String[] args) {
        String str = "Ebenezer";
        char t = 'z';
        System.out.println(search(str,t,1,4));
    }
    static boolean search(String str,char t,int start, int end){
        if(str.length()  == 0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(t==str.charAt(i)){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
}
