package Test;

public class Pyramid_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=1;
		int size=8;
		int space=size-1;
		for(int i=1;i<=size;i++)
		{
			for(int col=1;col<=space;col++)
			{
				System.out.print(" ");
			}
			int k=0;
			for(int j=1;j<=odd;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd=odd+2;
			space=space-1;
		}
	}
	}

