import java.math.*;

public class Problem20 {
	public static void main(String[] args) {
		BigInteger num = new BigInteger("100");
		
		for (int i = 1; i < 100; i++){
			BigInteger numTwo = new BigInteger(i + "");
			num = num.multiply(numTwo);
		}
		
		String numbers = "" + num;
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length(); i++){
			sum += Integer.parseInt(Character.toString(numbers.charAt(i)));
		}
		
		System.out.println("Your sum is: " + sum);
		
	}
}