public class NumofDigits {
    public static void main(String[] args) {
        int num=121;
        int count=0;
        while (num>0) {
            int d=num%10;
            count++;
            num=num/10;
            
        }
        System.out.println(count);
    }
    
}
