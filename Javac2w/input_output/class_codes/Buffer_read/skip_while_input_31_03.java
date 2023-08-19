import java.io.*;
class skipa{

	public static void main(String[] sau)throws IOException{

		BufferedReader abc = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Name of society: ");
		String name = abc.readLine();

		System.out.println("wing: ");
		abc.skip(1);
		char wing = Charachter.parseChar(abc.read());
		

		System.out.println("Flat no: ");
		int flat = Integer.parseInt(abc.readLine());

		System.out.println("Name of Society: "+name);
		System.out.println("Wing: "+wing);
		System.out.println("Flat no: "+flat);
	

	}
}
