public class Problem10 {
    public static void main(String[] args) {
		
		long sum = 2L;
		boolean isPrime = true;
		
		for (int i = 3; i < 2000000; i++){
			for (int j = 2; j < i; j++){
				if (i%j == 0){
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				System.out.println(sum + " + " + i + "...");
				sum += i;
			}
			isPrime = true;
		}
		
		System.out.println(sum + "!");
		
    }
}