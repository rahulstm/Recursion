public class SumOfArray {

    public static int arr(int input[],int n){
        if(n<=0){
            return 0;
        }

        return arr(input,n-1) + input[n-1];


    }
    public static void main(String[] args) {
        int input[] = {1,2,3,4};
       int n=input.length;
        //int index=0;
        System.out.println(arr(input,n));
        
    }
    
}
