package Test;

public class biggest_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[]= {200,34,78,85,95};
int i=0;
int min=n[i],min2=n[i];
for(i=1;i<n.length;i++)
{
if(n[i]<min)
{
	min2=min;
	min=n[i];
	}
else if(n[i]<min2)
{
	min2=n[i];
			}
}
	System.out.print(min);
	}

}
