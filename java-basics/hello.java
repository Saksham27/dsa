import java.util.Scanner;
import java.io.Console;
public class Hello{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String x  = sc.nextLine();
		System.out.println("Enter your last name : ");
		String y = System.console().readLine();
		System.out.println("Hey!!! "+x+" "+y+", Welcome to Java.");
	}
}
