import java.io.*;
class sumall{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array:");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];
		System.out.println("Enter elements: ");
		for(int i=0; i<arr1.length; i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}

		int x = 0;
		for(int j=0; j<arr1.length; j++){
		
			x = x+arr1[j];
		
		}
		System.out.println("The sum of all elements is: "+x);

	}
}
