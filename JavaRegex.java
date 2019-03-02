/*IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. 
Leading zeros are allowed. 
The length of A, B, C, or D can't be greater than 3.*/

import java.util.Scanner;

public class JavaRegex {
	Scanner scan =new Scanner(System.in);
	
	
	public  void ipFinder() {
		String IP=scan.nextLine();
		String[] values=IP.split("[.]+");
		int number[]= new int[values.length];
		int count=0;
		
		if(values.length==4)
		{
			for(int i=0;i<values.length;i++)
			{
				number[i]=Integer.parseInt(values[i]);
				
			}
			for(int num:number)
			{
				if(num>=0&&num<=255)
				{
					count++;
				}
				
			}
			if(count==4)
			{
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
			
		}
		else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		JavaRegex javaregx=new JavaRegex();
		javaregx.ipFinder();

	}

}
