import java.io.*;
class inputc{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Name of Player: ");
		String name  = ab.readLine();

		System.out.println("Jersey number: ");
		int number = Integer.parseInt(ab.readLine());

		System.out.println("Run rate: ");
		float rate = Float.parseFloat(ab.readLine());


		System.out.println("Name of Player: "+name);
		System.out.println("Jersey number: "+number);
		System.out.println("Run-rate: "+rate);

	}
}
