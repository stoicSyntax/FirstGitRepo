
import java.util.Scanner;
public class app{

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your School: ");
		String school = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter your academics: ");
		String academics = sc.nextLine();

       System.out.println("Hey "+name +"! you are "+age+" years old. "+ "you learn at "+school +".");
		
		sc.close();}
}
