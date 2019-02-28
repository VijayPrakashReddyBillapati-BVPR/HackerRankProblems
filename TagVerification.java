import java.util.Scanner;

public class TagVerification {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Tag;
		Tag=input.next();
		char[] code = Tag.toCharArray();
		if(Tag.charAt(2)!='A'||Tag.charAt(2)!='E'||Tag.charAt(2)!='I'||Tag.charAt(2)!='O'||Tag.charAt(2)!='U'||Tag.charAt(2)!='Y')
		{
			if(((code[0]+code[1])%2==0) && ((code[3]+code[4])%2==0) && ((code[4]+code[5])%2==0) && ((code[7]+code[8])%2==0))
			{
				System.out.println("VALID");
			}
			else {
				System.out.println("INVALID");
			}
			
		}
		else {
			System.out.println("INVALID");
		}
				

	}

}
