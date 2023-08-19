import java.io.*;
class findpalli{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array: ");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr1.length;i++){
		
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Checking for pallindrome elements...");
		for(int j=0;j<arr1.length;j++){
		
			int w=arr1[j];
			int x=0;
			while(w!=0){
			
				x=x*10;
				int y=w%10;
				w=w/10;
				x=x+y;
			}
			if(x==arr1[j]){
			
				System.out.println("Pallindrome found: "+x+" at index: "+j);
			}
		}

	}
}
