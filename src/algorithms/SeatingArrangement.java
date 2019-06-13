/*
 * Input : Train seating arrangement
 * 6(WS)  7(WS)			18(WS)  19(WS)		
 * 5(MS)  8(MS)			17(MS)  20(MS)		
 * 4(AS)  9(AS)			16(AS)  21(AS)		
 * 				
 * 3(AS)  10(AS)		15(AS)  22(AS)		
 * 2(MS)  11(MS)		14(MS)  23(MS)		
 * 1(WS)  12(WS)		13(WS)  24(WS)		and so on...	
 * 
 * Seat number as input will be given
 * 
 * Output : 
 * 1.Seat opposite to given seat number 
 * 2.Seat type of the opposite seat
 * */
package algorithms;

public class SeatingArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeatingArrangement seatingArrangement = new SeatingArrangement();
		seatingArrangement.logic(41);//input seat given
	}
	
	void logic(int seat) {
		int c=12;
		while(seat>c) {
			c=c+12;
		}
		
		//int temp = (12-(seat%12))+1;//seat==12?12:seat%12
		int temp = (12-(seat%12==0?12:seat%12))+1;
		String seatType = "";
		
		if(temp==1) seatType = "WS";
		if(temp==2) seatType = "MS";
		if(temp==3) seatType = "AS";
		if(temp==4) seatType = "AS";
		if(temp==5) seatType = "MS";
		if(temp==6) seatType = "WS";
		if(temp==7) seatType = "WS";
		if(temp==8) seatType = "MS";
		if(temp==9) seatType = "AS";
		if(temp==10) seatType = "AS";
		if(temp==11) seatType = "MS";
		if(temp==12) seatType = "WS";
		
		int oppositeSeat = temp+(c-12);
		
		System.out.println("Opposite Seat : " + oppositeSeat + "  Opposite Seat Type : " + seatType);
		
	}

}
