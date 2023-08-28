import java.io.*;
class findperfect{

	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of array: ");
		int a = Integer.parseInt(br.readLine());
		int arr1[] = new int[a];

		System.out.println("Enter elements: ");
		for(int i=0; i<arr1.length; i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}

		for(int j=0; j<arr1.length; j++){
		
		
			int w = arr1[j];
			int perfect = 0;
			for(int k=1; k<w; k++){
			
				if(w%k==0)
					perfect = perfect+k;

			}
			if(perfect==w)
				System.out.println("Perfect number found at "+w+" at index "+j);
		
		}
	}
}
