public class Problem14 {
	public static void main(String[] args) {
		int counter = 1;
		int highestCounter = 1;
		int largestChain = 1;
		int num = 0;
		for (int i = 1; i < 1000000; i++){
			num = i;
			counter = 1;
			while(true){
				if(num == 1){
					if (counter > highestCounter){
						highestCounter = counter;
						largestChain = i;
					}
					System.out.println("\n" + i + " produces a chain of " + counter + " numbers.");
					break;
				}
				else if (num%2 == 0){
					num = num/2;
					counter++;
					System.out.print(num+"...");
				}
				else{
					num = 3 * num + 1;
					counter++;
					System.out.print(num+"...");
				}
			}
		}
		System.out.println(num);
	}
}