import java.io.*;
class fibopat{

	public static void main(String[] sau)throws IOException{
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows:");
		int r = Integer.parseInt(br.readLine());
		int x=0;
		int y=1;
		int z=x+y;
		for(int i=1;i<=r;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(x+" ");
				x=y;
				y=z;
				z=x+y;	
			}
			System.out.println();

		}
   	}
}
