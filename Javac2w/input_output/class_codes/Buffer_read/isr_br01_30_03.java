import java.io.*;
class inputa{


	public static void main(String[] sau)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter name: ");
		String name = br.readLine();

		System.out.println(name);
		
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);
	}
}
