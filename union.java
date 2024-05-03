public class union{
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int m=arr1.length;
        int []arr2={7,8,9};
        int n=arr2.length;
        int []merge=new int[m+n];
        for(int i=0;i<m;i++){
            merge[i]=arr1[i];
        }
        for(int j=0;j<n;j++){
            merge[m+j]=arr2[j];
        }

        for(int i=0;i<m+n;i++){
            System.out.print(merge[i]+" ");
        }
    }
}