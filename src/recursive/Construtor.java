package recursive;

public class Construtor {

	/*public static void main(String[] args) {
	
		fact(5);
		
	}*/
	Construtor (int n){
		
		fact=fact*n;
		System.out.print(fact+"  ");
		n=n-1;
		if(n>0)
			new Construtor(n);
			//fact(n-1);
	
		//System.out.print(n);
		
	}
	
	static int fact=1;
	static void fact(int n) {
	
			
		//System.out.println(n);

		
	}

}
