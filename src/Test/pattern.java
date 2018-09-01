package Test;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner pattern=new Scanner(System.in);
System.out.print("Enter the number:");
int a=pattern.nextInt();
System.out.println("the value:");
{
	
	for(int row=1;row<=a;row++)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
	}

}
