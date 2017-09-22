public class Problem7 {
    public static void main(String[] args) {
		
		int primeCounter = 1;
		int num = 3;
		boolean isPrime = true;
		
		while (true){
			
			for (int i = 2; i < num; i++){
				if (num % i == 0){
					isPrime = false;
					break;
				}
			}
			
			if (isPrime){
				primeCounter++;
			}
			if (primeCounter == 10001){
				break;
			}
			isPrime = true;
			num++;
		}
		
		System.out.println(num);
		
    }
}