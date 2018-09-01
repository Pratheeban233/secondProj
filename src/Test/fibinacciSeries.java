package Test;

public class fibinacciSeries {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			{  
				 int a=0,b=1;  
				 System.out.print(a+" "+b);//printing 0 and 1  
				  
				 for(int i=2;i<10;i++)//loop starts from 2 because 0 and 1 are already printed  
				 {  
				  int c =a+b; // 1  2 3
				  System.out.print(" "+c);  //1 2 3
				  a=b;  // a = 1  a = 1 a = 2
				  b=c;  // b = 1 b = 2 b = 3 
				 }  

				}
		}
	}

