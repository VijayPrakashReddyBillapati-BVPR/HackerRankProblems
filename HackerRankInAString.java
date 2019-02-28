import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int N=scan.nextInt();
		String str="hackerrank";
		int count=0;
		String[] name=str.split("");
		
		for (int i = 0; i < N; i++) {
			String s = scan.next();
			for(int j = 0; j < name.length; j++)
			{
				String character=name[j];
				if(s.contains(character))
				{
					//System.out.println("YES");
					count++;
				}
			}
			
		}
		if(count==name.length) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
			
		

	}

}
