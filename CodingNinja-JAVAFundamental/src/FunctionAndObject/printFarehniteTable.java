package FunctionAndObject;

public class printFarehniteTable {

	public static void farehniteTable(int start, int end,int step) {
		int currentValue=start;
		while(currentValue<=end) {
			int farehniteValue=(int)(5.0/9)*(currentValue-32);
			System.out.println(currentValue+"\t"+farehniteValue);
			currentValue+=step;
		}
		
	}
	public static void main(String[] args) {
		farehniteTable(4,5,6);
	}

}



//Benefits of Function
//Readability
//Avoiding Repetition
//TestingEasu
