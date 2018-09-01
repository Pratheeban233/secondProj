package Test;

public class Class_Check {
//static int a=9; static { System.out.println(a);}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		int b=sum();
		System.out.println("the result is"+b);
	}
static int sum()
{
	int a1=0;
	int a2=1;
	int a3=a1+a2;
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<row;col++)
		{
			//System.out.print(a3+" ");
			a3=a1+a2;	//0+1=1		1+1=2 
			a1=a2;		//0=1 1=1	2=2
			a2=a3;		//1=1 1=1	1=1
		}
	
	
}
	return a3;
	}}
