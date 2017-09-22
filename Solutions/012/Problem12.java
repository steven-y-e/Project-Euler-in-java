public class Problem12 {
	public static void main(String[] args) {
		int next = 1;
		int num = 1;
		int factorCounter = 1;
		while (true){
			for (int i = 1; i < num; i++){
				if (num%i == 0){
					factorCounter++;
				}
			}
			
			if (factorCounter > 500){
				break;
			}
			
			System.out.println(num + " has " + factorCounter + " factors...");
			factorCounter = 1;
			next++;
			num+=next;
		}
		
		System.out.println(num);
		
	}
}