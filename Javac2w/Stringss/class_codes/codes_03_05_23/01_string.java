class stringdemo{

	public static void main(String[] sau){
	
		String str1 = "Saurabh";
		String str3 = "Wagh";

		String str2 = str1 + str3; //calls append method from String builder
		String str4 = str1.concat(str3);

		System.out.println(str2);
		System.out.println(str4);
	}
}
