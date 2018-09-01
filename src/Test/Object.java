package Test;

public class Object {
static int a=50;
	public static void main(String[] args) {
         
		new Object().display(5);
		new Object().play(a);
		
	}

	
	void display(int a)
	{
		  a=25;
System.out.println(a);		
	}
	void play(int b)
	{
		System.out.println(b);
		
	}

}
