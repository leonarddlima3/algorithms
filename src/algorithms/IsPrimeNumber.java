package algorithms;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		IsPrimeNumber isPrimeNumber =  new IsPrimeNumber();
		isPrimeNumber.logic(num);

	}
	
	public void logic(int num) {
		boolean temp = false;
		for(int i=2;i<num;i++) {
			if(num%i == 0) { //if number divisible by other than itself
				temp = true;
				break;
			}
		}
		if(temp) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a prime number");
		}
	}

}
