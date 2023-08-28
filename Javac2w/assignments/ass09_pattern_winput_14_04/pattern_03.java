import java.io.*;
class numul{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter the number of columns: ");
		int b = Integer.parseInt(br.readLine());
		for(int i=1;i<=a;i++){
		
			int x = b;
			for(int j=b;j>=i;j--){
			
				System.out.print((x*i)+" ");
				x--;
			}
			System.out.println();
		}

	}
}
