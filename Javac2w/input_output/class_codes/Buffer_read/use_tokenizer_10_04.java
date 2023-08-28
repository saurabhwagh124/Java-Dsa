import java.util.*;
import java.io.*;
class usetoken{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader sad = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Match_info,Man_of_match,Runs");
		String all = sad.readLine();

		StringTokenizer abc = new StringTokenizer(all,",");

		String info = abc.nextToken();
		String man = abc.nextToken();
		String runs = abc.nextToken();

	
		System.out.println("Match_info: "+info);

		System.out.println("Man_of_match: "+man);

		System.out.println("Runs: "+runs);

	}
}
