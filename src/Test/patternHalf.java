package Test;

public class patternHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int row=3;row>=1;row--)
{
	for(int col=3;col>row;col--)
		{
			System.out.print(" ");
		}
	for(int col=3;col>=row;col--)
	{
		System.out.print(col);
	}
	System.out.println();
}
	}

}
