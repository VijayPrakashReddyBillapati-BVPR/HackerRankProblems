import java.util.Scanner;

public class Seating {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int seatnumber;
		seatnumber=input.nextInt();
		switch(seatnumber%12)
		{
		case 0: System.out.println(seatnumber-11+ " " +"ws"); break;
		case 1: System.out.println(seatnumber+11+ " " +"ws"); break;
		case 2: System.out.println(seatnumber+9+ " " +"Ms"); break;
		case 3: System.out.println(seatnumber+7+ " " +"As"); break;
		case 4: System.out.println(seatnumber+5+ " " +"As"); break;
		case 5: System.out.println(seatnumber+3+ " " +"Ms"); break;
		case 6: System.out.println(seatnumber+1+ " " +"ws"); break;
		case 7: System.out.println(seatnumber-1+ " " +"ws"); break;
		case 8: System.out.println(seatnumber-3+ " " +"Ms"); break;
		case 9: System.out.println(seatnumber-5+ " " +"As"); break;
		case 10: System.out.println(seatnumber-7+ " " +"As"); break;
		case 11: System.out.println(seatnumber-9+ " " +"Ms"); break;
		}

	}

}
