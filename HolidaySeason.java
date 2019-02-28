import java.util.Scanner;

public class HolidaySeason {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		String X=scanner.next();
		if(N==X.length()) {
		
			char ch[]=X.toCharArray();
			int count=0;
			int result=1;
			for(int i=0;i<N;i++)
			{
				if('a'==ch[i]) count++; if(count>3) break;
				if('b'==ch[i]) count++; if(count>4) break;
				if('c'==ch[i]) count++; if(count>5) break;
				if('d'==ch[i]) count++; if(count>6) break;
				
				}
			int a = 0, b = 1;
				for (int i = 0; i < ch.length&&(a<ch.length&&b<ch.length); i++) {
					
					if ((ch[a] == ch[a + 2]) && (ch[b] == ch[b + 2])&&((a + 2)<ch.length-1)&&((b + 2)<ch.length-1)) {
						result += 1;
						a++;
						b++;
					} 
				}
			System.out.println(result);
		}
		scanner.close();

	}

}
