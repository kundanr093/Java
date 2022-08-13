import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		int m1, m2, m3, avg;
        String str;
        
        Scanner scan = new Scanner(System.in);
        
        str = scan.next();
        char c = str.charAt(0);
        
        m1 = scan.nextInt();
        m2 = scan.nextInt();
        m3 = scan.nextInt();
        
        avg = (m1+m2+m3)/3;
        
        System.out.println(c);
        System.out.println(avg);

		
	}

}
