import java.io.*;
class findarmstrong{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader chitragupt = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array: ");
		int a = Integer.parseInt(chitragupt.readLine());
		int arr1[]=new int [a];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr1.length;i++){
		
			arr1[i]=Integer.parseInt(chitragupt.readLine());
		} 
		System.out.println("Searching for Armstrong elements: ");
		for(int j=0;j<arr1.length;j++){
		
			int w=arr1[j];
			int d=0;
			int c=w;
			int n=0;
			while(c!=0){
				c=c/10;
				n++;
			}
		for(int k=1;k<=n;k++){
			
			int x=n;
			int e=1;
			int f=w%10;
			w=w/10;
			while(x>0){	
				e=e*f;
				x--;
			}
			d=d+e;
		}
		if(d==arr1[j]){
			
			System.out.println("Armstrong found: "+d+" at index: "+j);
		}

		}
	}

}
