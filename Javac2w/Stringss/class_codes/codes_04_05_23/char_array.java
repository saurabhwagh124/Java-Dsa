import java.io.*;
class Tochararraydemo{

	static int myStrLen(String str){
	
		char first[] = str.toCharArray();
		int count =0;
		for(int i =0; i<first.length;i++){
		
			count++;
		}
		return count;
	}
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		System.out.println("The length of the string is:"+(myStrLen(str1)));

	}
}
