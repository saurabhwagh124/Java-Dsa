import java.io.*;
class evenppp{

	public static void main(String [] sau) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array");
		int a = Integer.parseInt(br.readLine());

		int arr1[] = new int[a];

		for(int i=0; i<arr1.length; i++){
		
			System.out.println("Enter elements");
			arr1[i] = Integer.parseInt(br.readLine());
		}

			
		System.out.println("The output:");
		for(int j=0; j<arr1.length; j++){
		
			int p = 0;
			int q = arr1[j];
			while(q!=0){
			
				int r = q%10;
				q = q/10;
				p = p+r;
			}
			if(p%2==0){			

				System.out.println(arr1[j]);
			}
		}

	}
}
