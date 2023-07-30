package String;

public class StringDemo {

	public static void main(String[] args) {
		char arr[]= {'a','b','c','e'};
		String str= "coding";
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		
		String str1="";
		System.out.println(str1.length());
		System.out.println(str1.contains("ing"));
		
		
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(6)); //not error
		
		// str.charAt(-1)   NotValid
		//compare To return gap in string in ASCI format
	

	}

}
