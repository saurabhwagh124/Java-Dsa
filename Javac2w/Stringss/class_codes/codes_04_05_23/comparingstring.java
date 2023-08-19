import java.io.*;
class comparlenstr{

	static int myStrLen(String str){
	
		char fir[] = str.toCharArray();
		int count = 0;
		for(int i=0;i<fir.length;i++){
		
			count++;
		}
		return count;
	}
	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		if(myStrLen(str1) == myStrLen(str2)){
		
			System.out.println("Both Strings are equal");
		}
		else{
		
			System.out.println("Strings are unequal");
		}
	}
}
