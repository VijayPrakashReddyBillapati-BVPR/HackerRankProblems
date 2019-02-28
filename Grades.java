import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] grades=new int[n];
		for(int i=0;i<grades.length;i++)
		{
			grades[i]=scanner.nextInt();
		}
		for(int i=0;i<grades.length;i++)
		{
			int remainder=grades[i]/5;
			int nearbymultiple=(remainder+1)*5;
			//use only one expression after && i.e in parenthesis
			if((nearbymultiple-grades[i])<3 && (grades[i]>37||(grades[i]+(nearbymultiple-grades[i]))>=40))
			{
				grades[i]=nearbymultiple;
			}
		}
		for(int i=0;i<grades.length;i++)
		{
			System.out.println(grades[i]);
		}
		scanner.close();

	}

}
