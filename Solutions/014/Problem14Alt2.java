public class Problem14 {
	public static void main(String[] args) {
		long counter = 1L;
		long highestCounter = 1L;
		long largestChain = 1L;
		long num = 0L;
		
		for (long i = 2L; i < 1000000L; i++){
			num = i;
			counter = 1;
			
			while(num != 1){
				if ((num % 2) == 0){
					num = num / 2;
				}
				else {
					num = num * 3 + 1;
				}
				counter++;
			}
			if (counter > highestCounter){
				highestCounter = counter;
				largestChain = i;
			}
		}
		System.out.println("Number that produces the largest chain: " + largestChain);
	}
}