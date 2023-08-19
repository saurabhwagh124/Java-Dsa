import java.io.*;
class signs{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number of rows: ");
		int a = Integer.parseInt(br.readLine());
		char x = '=';
		char y = '#';
		for(int  i = 1;i<=a;i++){
		
			for(int j =1;j<=a;j++){
			
				if(i==j){
				
					System.out.print(y+" ");	
				}
				else{
				
					System.out.print(x+" ");
				}
			}
			System.out.println();
		}

	}
}
