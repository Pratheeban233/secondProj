package Test;

public class Array_MiddleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {5,20,10,16,24,25,52};

int i=a.length/2;

	if(a.length%2!=0)
	{
		System.out.print(a[i]);
	}
	else
	{
		System.out.print("NO");
	}
}

}


