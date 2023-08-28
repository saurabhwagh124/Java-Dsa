import java.io.*;
class inputb{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Name of Batsman");
		String bat = a.readLine();

		System.out.println("Name of Bowler");
		String bowl = a.readLine();

		System.out.println("Batsman: "+bat);
		System.out.println("Bowler: "+bowl);

	}
}
