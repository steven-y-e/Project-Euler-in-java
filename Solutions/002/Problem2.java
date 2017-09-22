public class Problem2 {
    public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int j = 0;
		int k = 0;
		while (i<4000000){
			
			System.out.println(i);
			
			if(i%2 == 0){
				sum+=i;
			}
			
			k = j;
			j = i;
			i = j+k;
			
		}
		
        System.out.println(sum);
    }
}