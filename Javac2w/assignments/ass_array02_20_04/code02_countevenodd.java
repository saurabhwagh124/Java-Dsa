import java.io.*;
class countevenodd{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array: ");
		int a = Integer.parseInt(br.readLine());

		int arr1[] = new int [a];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr1.length; i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}

		int even = 0;
		int odd = 0;
		for(int j=0;j<arr1.length; j++){
		
		
			if(arr1[j]%2==0){
			
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("The number of even elements is: "+even+ " and odd is: "+odd);
		

	}
}
