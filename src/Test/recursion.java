package Test;

public class recursion {
	
	static int add()
	{
	int a=10,b=20;
	int c=a+b;
	return c;
	}
	static int sub()
	{
	int aa=10,bb=20;
	int cc= aa-bb;
	return cc;
	}

	public static void main(String[] args) {

		int aaa = add();
		int bbb = sub();
		
		System.out.println(aaa);
		System.out.println(bbb);
		
	}
}


