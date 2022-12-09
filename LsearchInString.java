public class LsearchInString {

    static boolean search(String str, char t){
        if(str.length()==0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(t==str.charAt(i)){
                System.out.println(i);
                return true;
            }
        }
        return false;
        
        
    }

    static boolean search2(String str, char t){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==t){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Ebenezer";
        char target = 'E';//This will give 0 index
        char target1 = 'e';//This will give 2 index --- as it occured at first place
        System.out.println(search(name, target));
        System.out.println(search(name, target1));
        System.out.println(search2(name, target));
        System.out.println(search2(name, target1));
    }
}
