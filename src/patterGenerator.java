import java.util.Scanner;

public class patterGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter any number: ");
		int num = scan.nextInt();
		patternGen(num);
	}
	
	private static void patternGen(int num) {
		for(int i = 0; i<num;i++) {
			int temp1 = i;	
			while(temp1!=0) {
				System.out.print("*");
				temp1--;
			}
			System.out.println();
		}
		
		for(int i = 0; i<num;i++) {
			int temp = i;	
			while(temp!=num) {
				System.out.print("*");
				temp++;
			}
			System.out.println();
		}
	}
}
