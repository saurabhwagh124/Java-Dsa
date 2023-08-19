import java.io.*;
class diffasciis{

	static int mystrlen(String str){
	
		char arr[] = str.toCharArray();
		int count = 0;
		for (int i=0;i<arr.length;i++){
		
			count++;
		}
		return count;
	}
	static int compstr(String str1,String str2){
	
		char arra[] = str1.toCharArray();	
		char arrb[] = str2.toCharArray();
		int a=0;
		for (int i = 0;i < arra.length;i++){
			int flag=0;
			if(arra[i] == arrb[i]){
			
				flag=1;
			}
			 else{
				 a= (arra[i]-arrb[i]);
			 }
		}
		return a;
	}	

	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		if(mystrlen(str1)==mystrlen(str2)){
		
			System.out.println("The difference in string:"+(compstr(str1,str2)));

		}
		else{
		
			System.out.println("String length are unequal and cannot be compared");
		}
	}

}

