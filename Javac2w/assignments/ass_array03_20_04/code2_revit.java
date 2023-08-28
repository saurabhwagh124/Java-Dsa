import java.io.*;
class revit{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Set Length of array: ");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];

		System.out.println("Enter elements");
		for(int i=0; i<arr1.length; i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("The reverse is: ");
		for(int j=0; j<arr1.length; j++){
			int q = arr1[j];
			int b = 0;
			while(q!=0){
			b=b*10;
			int p = q%10;
			q = q/10;
			b=b+p;
			}
			System.out.println(b);
		}
	}
}
