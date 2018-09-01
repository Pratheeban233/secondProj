package recursive;

public class Pattern_matrix {

	public static void main(String[] args) {
		pattern(row,col);
	}
	
	static int row=1,col=1,n=3;
	static void pattern(int row,int col)
	{
		if(row<=n)
		{
			if(col<=n)
			{
				System.out.print("* ");
				col=col++;
			}
			row=row++;
		}
	
		pattern(row,col);
	}

}
