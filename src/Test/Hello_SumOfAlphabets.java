package Test;

public class Hello_SumOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char []a= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
char []b= {'H','E','L','L','O'};
int sum=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0; j<b.length; j++)
		{
			if(b[j]==a[i])
			{
				System.out.print(i+1+" ");
				sum=sum+i;
			}
		}
	}
	System.out.println(sum);
}}
