import java.util.Scanner;

public class PrintNumbers{

    public static void Print(int n){
        if(n==0){
            return ;

        }
        System.out.print(n+" ");
        Print(n-1);
       

    }


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=obj.nextInt();
        Print(n);
        
    }
}