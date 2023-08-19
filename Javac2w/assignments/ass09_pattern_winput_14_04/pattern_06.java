import java.io.*;
class diffchar{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st charachter:");
		char o = (char)br.read();
		br.skip(1);
		System.out.println("Enter last charachter: ");
		char z = (char)br.read();
		br.skip(1);
		if(o==z){
		
			System.out.println("Charachters are the same: "+o);
		}
		else{
		
			int a = (int)o;
			int b = (int)z;
			System.out.println("The positional difference is: "+(b-a));
		}
	}
}
