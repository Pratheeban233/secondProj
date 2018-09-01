package Test;

public class Fibonacci_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1=0;
int a2=1;
int a3=a1+a2;
for(int row=1;row<=5;row++)
{
	for(int col=1;col<row;col++)
	{
		System.out.print(a3+" ");
		a3=a1+a2;	//0+1=1		1+1=2 
		a1=a2;		//0=1 1=1	2=2
		a2=a3;		//1=1 1=1	1=1
	}
	System.out.println();
}
	
}
	}


