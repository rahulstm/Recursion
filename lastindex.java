
public class lastindex {

	public static void main(String[] args) {
        
        int input[] = {9,8,10,8};
        int x=8;
		int count=0;
		for(int i=0;i<input.length;i++){
			if(input[i]==x){
				count++;
				if(count==2){
					System.out.println(i);
				}

			}
		}
		System.out.println(-1);
		
	}
	
}