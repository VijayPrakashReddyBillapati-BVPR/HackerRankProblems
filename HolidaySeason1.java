import java.util.Scanner;

public class HolidaySeason1 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        String str = s.next();
        int count = 0;
        for (int i = 0; i <= N - 4; i++) {
            for (int j = i + 1; j <=N - 3; j++) {
                for (int k = j+1; k <= N - 2; k++) {
                    for (int l = k + 1; l <= N - 1; l++) {
                            if(str.charAt(i)==str.charAt(k) && str.charAt(j)==str.charAt(l))
                                count++;
                    }
                }
            }
        }
 
        System.out.println(count);

	}

}
