public class Problem21 {
	public static void main(String[] args) {
		int sum = 0;
        for(int i = 2; i <= 10000; i++){
            int amiOne = d(i);
            if (amiOne > i && amiOne <= 10000){
                int amiTwo = d(amiOne);
                if(amiTwo == i){
                    sum += i + amiTwo;
                }
            }
        }
        /*
        for(int i = 1; i < 10000; i++){	
            //if d(a) = b and d(b) = a
            //then a and b are an amicable pair.
            //if i == d(d(i)) 
            //then i is an amicable?
			if( i == d(d(i)) && d(d(i)) < 10000 ){
				sum+=i;
			}
		}
        */
		System.out.println("Your sum is: " + sum);
	}
	public static int d(int n){
		int sum = 0;
		for (int i = 1; i < n; i++){
			if(n%i == 0){
				sum+=i;
			}
		}
		return sum;
	}
}