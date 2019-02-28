import java.util.Scanner;

public class Seatings {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int seatnumber;
		seatnumber=input.nextInt();
		int c = seatnumber % 12;
		switch (c) {
		case 1:
			System.out.println((seatnumber + 11) + " " + "WS");
			break;
		case 2:
			System.out.println((seatnumber + 9) + " " + "MS");
			break;
		case 3:
			System.out.println((seatnumber + 7) + " " + "AS");
			break;
		case 4:
			System.out.println((seatnumber + 5) + " " + "AS");
			break;
		case 5:
			System.out.println((seatnumber + 3) + " " + "MS");
			break;
		case 6:
			System.out.println((seatnumber + 1) + " " + "WS");
			break;
		case 7:
			System.out.println((seatnumber - 1) + " " + "WS");
			break;
		case 8:
			System.out.println((seatnumber - 3) + " " + "MS");
			break;
		case 9:
			System.out.println((seatnumber - 5) + " " + "AS");
			break;
		case 10:
			System.out.println((seatnumber - 7) + " " + "AS");
			break;
		case 11:
			System.out.println((seatnumber - 9) + " " + "MS");
			break;
		case 0:
			System.out.println((seatnumber - 11) + " " + "WS");
			break;
		}

	}

}
