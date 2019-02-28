import java.util.Arrays;
import java.util.Scanner;

public class SpecialShop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int T=scanner.nextInt();
		int N[]=new int[T];
		int A[]=new int[T];
		int B[]=new int[T];
		
		for(int i=0;i<T;i++)
		{
		
		N[i]=scanner.nextInt();
		A[i]=scanner.nextInt();
		B[i]=scanner.nextInt();
		
		 int optimal[]=new int[N[i]+1];
			 
			 for(int j=0, k=N[i];j<=N[i];j++ , k--)
				{
				 
				 optimal[j]=(A[i]*(j*j))+(B[i]*(k*k));
				}
			 Arrays.sort(optimal);
			 
				 System.out.println(optimal[0]);
		}
		scanner.close();

	}

}
