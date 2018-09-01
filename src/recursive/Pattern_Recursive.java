package recursive;

public class Pattern_Recursive {

	public static void main(String[] args)
	
	{
		pattern(0,0);
	}
	
	
	static int n=5;
	static void pattern (int row,int col) 
	{
		
		if(row<n&&col<n) 
			{
			System.out.print("* * * * ");
				//if(row==col||row+col==4)
				
				
				System.out.println("* ");
				row++;
				col++;
				pattern(row,col);
			}
	}
}
