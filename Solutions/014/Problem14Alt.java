public class Problem14Alt {
	public static void main(String[] args) {
		final int NUMBER = 1000000;
		int sequenceLength = 0;
		int startingNumber = 0;
		long sequence;
		
		int[] cache = new int[NUMBER + 1];
		//initialize cache
		for (int i = 0; i < cache.Length; i++){
			cache[i] = -1;
		}
		
		for (int i = 2; i <= NUMBER; i++){
			sequence = i;
			int k = 0;
			while (sequence != 1 && sequence >= i){
				k++;
				if ((sequence % 2) == 0 {
					sequence = sequence / 2;
				}
				else {
					sequence = sequence * 3 + 1;
				}
			}
			//store result in cache
			cache[i] = k + cache[sequence];
			
			//check if sequence is the best solution
			if (cache[i] > sequenceLength) {
				sequenceLength = cache[i];
				startingNumber = i;
			}
		}
		
		System.out.println("The starting number " + startingNumber + " produces a sequence of " + sequenceLength);
		
	}
}