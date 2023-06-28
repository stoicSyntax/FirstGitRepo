
import java.util.Scanner;
public class app{

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.println("Hey "+name +"! you are "+age+"years old");
		
		 
		
		sc.close();}

}
