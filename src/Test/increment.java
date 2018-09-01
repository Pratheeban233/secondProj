package Test;

public class increment {
public static void main(String[] args)
{
int size=8,count=0;
int odd=1,col;
int n;
for(int row=1;row<=size;row++)
{
	for(col=1;col<=odd;col++)

		if(col<=row)
		{
			count=count+1;
		}
		else
		{
			count=count-1;
		}
	
		System.out.print(col);
	}
	System.out.println();
	 odd=odd+2;
}
}
