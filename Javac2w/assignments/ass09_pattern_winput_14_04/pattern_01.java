import java.io.*;
class first{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number of rows: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Input number of columns: ");
		int b = Integer.parseInt(br.readLine());
		for(int i = 1;i<=a;i++){
		
			int m = 64;
			int z = m+b;
			int n = 65;
			int ab = a;
			int bc = 1;
			for(int j=1;j<=b;j++){

				if(i%2!=0){
					System.out.print((char)z+""+ab+" ");
					z--;
					ab--;
				}
				else{
				
					System.out.print((char)n+""+bc+" ");
					n++;
					bc++;
				}
			}
			System.out.println();

		}
	}
}
