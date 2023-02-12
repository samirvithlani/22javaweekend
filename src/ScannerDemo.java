import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//local variable  intiilize...

		System.out.println("enter no");
		int no = sc.nextInt();
		System.out.println("no = "+no);
		String name="";
		System.out.println("enter name");
		name = sc.next();
		System.out.println("name = "+name);	
	}
}
