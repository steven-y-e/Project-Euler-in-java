public class Problem4 {
    public static void main(String[] args) {
		boolean isPalindrome = false;
		int product = 0;
		int largestPalindrome = 0;
		String productString;
		for (int i = 1; i < 1000; i++){
			for (int j = 1; j < 1000; j++){
				product = i * j;
				productString = "" + product;
				if (new StringBuilder(productString).reverse().toString().equals(productString) && product > largestPalindrome){
					largestPalindrome = product;
					System.out.println(product);
				}
			}
		}
    }
}