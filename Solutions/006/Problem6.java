public class Problem6 {
    public static void main(String[] args) {
		
		int sumSquare = 0;
		int squareSum = 0;
		
		for (int i = 1; i <= 100; i++){
			sumSquare += (i*i);
			squareSum += i;
		}
		
		squareSum = squareSum * squareSum;
		
		System.out.println((squareSum - sumSquare));
		
    }
}