import java.text.DecimalFormat;

public class IntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Integer.toString(int)
		int num = 123;
		String s1 = Integer.toString(num);
		System.out.println("string representation of " + num + " is : " + s1);
		
		//2. String.valueOf(int)
		int num2 = 54321;
		String s2 = String.valueOf(num2);
		System.out.println("string representation of " + num2 + " is : " + s2 + " , length is : " + s2.length());
		
		
		//3. DecimalFormat class - Is a class that formats a number to a string. imports java.text.DecimalFormat
		//prints int - 123456789 into 123,456,789 format
		DecimalFormat df = new DecimalFormat();
		int num3 = 123456789;
		String s3 = df.format(num3);
		System.out.println("string representation of number " + num3 + " is : " + s3 + " and s3 length is : " + s3.length());
		
		//4. StringBuilder append(int) method. append() can take any data type & append that to string builder object
		StringBuilder sb = new StringBuilder();
		sb=sb.append(24680);
		System.out.println("string is : " + sb.toString());

	}

}
