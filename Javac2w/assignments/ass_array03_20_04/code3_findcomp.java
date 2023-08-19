import java.io.*;
class findcomp{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length for array: ");
		int a = Integer.parseInt(br.readLine());

		int arr1[] = new int[a];
		System.out.println("Enter elements: ");
		for(int i=0; i<arr1.length; i++){
		
			arr1[i]=Integer.parseInt(br.readLine());
		}
		for(int j=0; j<arr1.length;j++){
			int b = arr1[j];
			int count = 0;
			for(int k=1; k<b; k++){
			
				if(b%k==0){
				
					count++;
				}
			}
			if(count>2){
			
				System.out.println("Composite found: "+b+ " at index: "+j);
			}

		}
	}
}
