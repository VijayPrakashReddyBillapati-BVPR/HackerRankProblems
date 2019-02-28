import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {
	
	//static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
	static void compareTriplets(List<Integer> a, List<Integer> b){
        int aScore=0;
        int bScore=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i))
            {
                aScore++;
            }
            else if(a.get(i)<b.get(i))
            {
                bScore++;
            }
            
            
        }
        System.out.println(aScore+" "+bScore);
    }

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		String[] firstLine=scan.nextLine().split(" ");
		    Integer[] intarray=new Integer[firstLine.length];
		    int i=0;
		    for(String str:firstLine){
		        intarray[i]=Integer.parseInt(str);//Exception in this line
		        i++;
		}
		    for(Integer first:intarray)
		    	a.add(first);
		    
		    String[] secondLine=scan.nextLine().split(" ");
		    Integer[] intarray1=new Integer[secondLine.length];
		    int j=0;
		    for(String str:secondLine){
		        intarray1[j]=Integer.parseInt(str);//Exception in this line
		        j++;
		}
		    for(Integer second:intarray1)
		    	b.add(second);
		    
		    compareTriplets(a , b);
		    
	}
}