import java.util.Scanner;

public class factorial{

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallans=fact(n-1);
        return n*smallans;

    }


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter factorial : ");
        int f=obj.nextInt();
        System.out.println(fact(f));
        
    }
}