
import java.util.Scanner;
public class app{

	public static void main(String[]args) {
		
		Scanner myvar=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = myvar.nextLine();
		
		System.out.print("Enter your School: ");
		String school = myvar.nextLine();
		
		System.out.print("Enter your age: ");
		int age = myvar.nextInt();

       System.out.println("Hey "+name +"! you are "+age+" years old. "+ "you learn at "+school +".");
		
		myvar.close();}
}
