import java.io.*;
class findsecmax{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length for array: ");
		int a=Integer.parseInt(br.readLine());
		int arr1[] = new int[a];
		System.out.println("Enter elemnets: ");
		for(int i=0;i<arr1.length;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Searching for second largest element: ");
		int w = arr1[0];
		int c = 0;
		for(int j=0;j<arr1.length;j++){
		
			if(w>arr1[j]){
			}else{
			c = w;
			w = arr1[j];
			}

		}
		System.out.println("Second max element is: "+c);

	}
}
