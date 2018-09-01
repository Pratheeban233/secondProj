package recursive;

public class pattern_example {

	public static void main(String[] args) {
		
		int n=5;
		int i=0;
		return 0;
	}
	//static int n=5;
		static void printPatternRecur(n, i)
	{
	    if( n < 1)
	        return;
	    
	    if (i <= n)
	    {
	        System.out.print( "* ");
	       printPatternRecur(n, i+1);
	    }
	    else
	    {
	        System.out.print ("\n");
	        printPatternRecur(n-1, 1);
	    }
	}


