package Test;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long n=9001111009l,r,s=0;
long temp=n;
while(n>0)
{
r=n%10;
n=n/10;
s=s*10+r;
//System.out.println(r);
//System.out.println(n);
//System.out.println(s);
}
if(temp==s)
{
System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
	}

}
