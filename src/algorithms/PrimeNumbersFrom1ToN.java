package algorithms;

public class PrimeNumbersFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbersFrom1ToN primeNumbersFrom1ToN = new PrimeNumbersFrom1ToN();
		primeNumbersFrom1ToN.logic(100);
	}
	
	public void logic(int n) {
		boolean temp = false;
		for(int i=2;i<=n;i++) {
			temp = false;
			for(int j=2;j<i;j++) {
				if(i==2) {
					System.out.println(j);
					temp=false;
					break;
				} else {
					if(i%j == 0) {
						temp=true;
						break;
					}
				}
			}
			if(!temp) {
				System.out.println(i);
			}
			
		}
	}

}
