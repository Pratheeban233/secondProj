package Test;

public class biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int big[]= {12,1455,8778,85};
int max=0,max2=0;
big[0]=max;
if(big[1]>max)
{

	max2=max;
	max=big[1];
}
if(big[2]>max)
{	
	max2=max;
	max=big[2];
}
if(big[3]>max)
{	
	max2=max;
	max=big[3];
}
else if(big[3]>max2)
{
	max2=big[3];
}
System.out.print(max2);
	}

}
