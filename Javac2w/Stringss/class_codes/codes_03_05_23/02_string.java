class hashcode{

	public static void main(String[] sau){
	
		String str1 = "shashi";
		String str2 = new String("shashi");
		String str3 = "bagal";
		String str4 = new String("bagal");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
