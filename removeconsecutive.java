public class removeconsecutive {
    public static void main(String[] args) {
        String s="aabccba";
       // output = abcba
        String result="";
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i)!=s.charAt(i-1)){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
