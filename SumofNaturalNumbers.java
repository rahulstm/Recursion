import java.util.Scanner;

public class SumofNaturalNumbers {

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int small = sum(n-1);
        return n+small;
    }





    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter number : ");
        int n =obj.nextInt();
        System.out.println(sum(n));
       

    }
    
}
