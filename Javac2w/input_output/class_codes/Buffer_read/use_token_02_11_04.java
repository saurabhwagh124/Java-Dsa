import java.util.*;
class looptoken{

	public static void main(String[] sau){
	
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter player info: ");

		String bad = abc.nextLine();

		StringTokenizer bb = new StringTokenizer(bad," ");
		System.out.println(bb.countTokens());

		while(bb.hasMoreTokens()){
		
			System.out.println(bb.nextToken());
		}
	}
}
