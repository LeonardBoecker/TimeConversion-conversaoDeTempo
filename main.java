import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
       
        int Mins = 0;
        int Hours = 0;
        
        
       int N = in.nextInt();
        
        while(N >= 60){
            N = N - 60;
            Mins = Mins + 1;
        }
        while(Mins >= 60){
            Mins = Mins - 60;
            Hours = Hours + 1;
        }
        
        System.out.printf("%d:%d:%d\n",Hours,Mins,N);
        
    }
 
}
