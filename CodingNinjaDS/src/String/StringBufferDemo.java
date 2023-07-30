package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("abc");
		str.setCharAt(0, 'd');
		
		str.append("abcuhu");
		
		System.out.println(str +" "+str.length());
		

	}

}
