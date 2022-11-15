

 
public class RandomNumber {

	public static void main(String[] args) {
		
		for(int x =0 ; x<=100; x++) {
			int number = x;
			
			if(number%3==0){
				System.out.print("Fizz");
			}
			else if(number%5==0){
				System.out.print("Buzz");
			}
			else if(number%15==0){
				System.out.print("FizzBuzz");
			}
			System.out.println(number);
		}

	}

}
