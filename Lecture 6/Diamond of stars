import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		
		
		int n = scan.nextInt();
        
 	   int i = 1;

		
		while (i <= (n / 2) + 1) {
			
			int spaces = 1;
			while (spaces <= (n / 2) + 1 - i) {
				System.out.print(" ");
				spaces++;
			}

			int j = 1;
			
			while (j <= (2 * i) - 1) {
				System.out.print("*");
				j++;
			}

			System.out.println();
			i++;
		}
		i = 1;

		
		while (i <= n / 2) {
			
			int spaces = 1;
			while (spaces <= i) {
				System.out.print(" ");
				spaces++;
			}

			int j = 2 * ((n / 2) - i + 1) - 1;

			
			while (j >= 1) {
				System.out.print("*");
				j--;
			}

			System.out.println();
			i++;
		}
    }
}
