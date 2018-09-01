package Test;

public class Spiral_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=3;i++)
{
	for(int j=1;j<=3;j++)
	{
		if(i==1&&j==1)
		{
			System.out.print("1 ");
		}
		else if(i==1&&j==2)
		{
			System.out.print("2 ");
		}
		else if(i==1&&j==3)
		{
			System.out.print("3 ");
		}
		else if(i==2&&j==1)
		{
			System.out.print("8 ");
		}
		else if(i==2&&j==2)
		{
			System.out.print("9 ");
		}
		else if(i==2&&j==3)
		{
			System.out.print("4 ");
		}
		
		else if(i==3&&j==1)
		{
			System.out.print("7 ");
		}
		else if(i==3&&j==2)
		{
			System.out.print("6 ");
		}
			else if(i==3&&j==3)
		{
			System.out.print("5 ");
		}
	}System.out.println();
}
	}

}
