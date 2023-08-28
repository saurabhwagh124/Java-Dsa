import java.io.*;
class sumevenodd{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array: ");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];

		System.out.println("Enter elements: ");
		for(int j=0;j<arr1.length;j++){
		
			arr1[j] = Integer.parseInt(br.readLine());
		}

		int even =0;
		int odd = 0;


		for(int i=0;i<arr1.length; i++){
		
			if(arr1[i]%2==0){
			
				even = even+arr1[i];
			}
			else{
			
				odd = odd+arr1[i];
			}
		}
		System.out.println("The sum of all even is: "+even+ " and of odd is: "+odd);
	}
}
