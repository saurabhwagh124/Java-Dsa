import java.io.*;
class countin{

	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the length for array");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];

		System.out.println("Input elements:");
		for(int i=0; i<arr1.length; i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("The output is:");
		for(int j=0;j<arr1.length;j++){
		
			int count=0;
			int p = arr1[j];
			while(p!=0){
			
				p=p/10;
				count++;
			}
			System.out.println(count);
		}
	}

}
