public class Problem17 {
	public static void main(String[] args) {
		String[] numberWord = new String[1001];
		
		//initialize array
		for(int i = 0; i < 1001; i++){
			numberWord[i] = "";
		}
		
		//hardcode first 20 + every ten + every hundred
		numberWord[1] = "one";
		numberWord[2] = "two";
		numberWord[3] = "three";
		numberWord[4] = "four";
		numberWord[5] = "five";
		numberWord[6] = "six";
		numberWord[7] = "seven";
		numberWord[8] = "eight";
		numberWord[9] = "nine";
		numberWord[10] = "ten";
		numberWord[11] = "eleven";
		numberWord[12] = "twelve";
		numberWord[13] = "thirteen";
		numberWord[14] = "fourteen";
		numberWord[15] = "fifteen";
		numberWord[16] = "sixteen";
		numberWord[17] = "seventeen";
		numberWord[18] = "eighteen";
		numberWord[19] = "nineteen";
		numberWord[20] = "twenty";
		numberWord[30] = "thirty";
		numberWord[40] = "forty";
		numberWord[50] = "fifty";
		numberWord[60] = "sixty";
		numberWord[70] = "seventy";
		numberWord[80] = "eighty";
		numberWord[90] = "ninety";
		numberWord[100] = "onehundred";
		numberWord[200] = "twohundred";
		numberWord[300] = "threehundred";
		numberWord[400] = "fourhundred";
		numberWord[500] = "fivehundred";
		numberWord[600] = "sixhundred";
		numberWord[700] = "sevenhundred";
		numberWord[800] = "eighthundred";
		numberWord[900] = "ninehundred";
		numberWord[1000] = "onethousand";
		String and = "and";
		
		for(int i = 0; i < 21; i++){
			System.out.println(numberWord[i]);
		}
		
		//populate the rest somehow???
		for(int i = 21; i < 1001; i++){
			int ones = i % 10;
			int tens = i % 100 - ones;
			int huns = i - tens - ones;
			
			String numberWordInProgress = "";
			if(
				i == 20 ||
				i == 30 ||
				i == 40 ||
				i == 50 ||
				i == 60 ||
				i == 70 ||
				i == 80 ||
				i == 90 ||
				i == 100 ||
				i == 200 ||
				i == 300 ||
				i == 400 ||
				i == 500 ||
				i == 600 ||
				i == 700 ||
				i == 800 ||
				i == 900 ||
				i == 1000){
				System.out.println(numberWord[i]);
			}
			else{
				if(i > 100){
					numberWordInProgress += numberWord[huns];
					numberWordInProgress += and;
				}
				
				if(tens >= 20 || tens == 0){
					numberWordInProgress += numberWord[tens];
					numberWordInProgress += numberWord[ones];
				}
				else if(tens == 10){
					numberWordInProgress += numberWord[tens+ones];
				}
				
				numberWord[i] = numberWordInProgress;
				System.out.println(numberWord[i]);
			}
			
		}
		int length = 0;
		
		for(int i = 1; i < 1001; i++){
			length += numberWord[i].length();
		}
		
		System.out.println("The length of all these words is " + length);
	}
}