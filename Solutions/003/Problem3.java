public class Problem3 {
    public static void main(String[] args) {
		boolean isPrime = true;
		boolean isFactor = false;
		for (long i = 600851475143L; i > 1L; i--){
			for (long j = 2L; j < i; j++){
				if (i%j == 0L){
					isFactor = true;
					break;
				}
			}
			if (isFactor){
				System.out.println(i + "is a factor.");
				for (long j = 2L; j < i; j++){
					if (i%j == 0L){
						isPrime = false;
						break;
					}
				}
				if (isPrime){
					System.out.println(i + " is prime!");
					break;
				}
			
				else{
					System.out.println(i + " is not prime...");
					isPrime = true;
					isFactor = false;
				}
			}
		}
    }
}