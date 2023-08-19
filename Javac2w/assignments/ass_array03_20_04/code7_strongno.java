import java.io.*;
class findstrong{

	public static void main(String[] sau)throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array: ");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr1.length;i++){
		
			arr1[i]=Integer.parseInt(br.readLine());
		}

		for(int j=0;j<arr1.length;j++){
		
			int w=arr1[j];
			int c=0;
			while(w!=0){
			
				int z=w%10;
				int y=1;
				for(int k=z;z>=1;z--){
					y=y*z;
				}
				c=c+y;
				y=1;
				w=w/10;
			}
			if(c==arr1[j]){
			
				System.out.println("Strong number: "+c+"at index: "+j);
			}

		}
	}
}
