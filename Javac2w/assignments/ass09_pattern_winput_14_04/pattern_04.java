import java.io.*;
class revit{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter end number:");
		int b = Integer.parseInt(br.readLine());
		int x=a;
		int y=b;

		for(int i=1;x<=b&&y>=a;i++){
		
			for(int j=a;x<=b&&y>=a;j++){
				if(x%2!=0){
				
					System.out.print(x+"");
					x=x+2;
				}
				else{
				
					x=x+1;
					System.out.print(x+"");
					x=x+2;
				}
				if(y%2!=0){
				
					y=b-1;
					System.out.print(y+"");
					y=b-2;
				}
				else{
				
					System.out.print(y+"");
					y=y-2;
				}
			}
			System.out.println();
		}
	}
 for(int k=1;k<=x;k++){
            cout<<k<<" ";
        }}		
