import static java.lang.Math.sqrt;

public class Problem9 {
    public static void main(String[] args) {
		
		double c;
		
		for (int b = 1; b < 1000; b++){
			for (int a = 1; a < b; a++){
				c = sqrt(a*a + b*b);
				if (c == (int)c && a + b + c == 1000 && b < c){
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println((a*b*c));
				}
			}
		}
    }
}