package Test;

public class char_RepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char[]name= {'c','h','e','n','n','a','i'};
	int i=0;
	int count=0;
	for(;i<=name.length;i++)
	{
		if(name[i]==name[i+1])
		{
			System.out.print(name[i]);
			count++;
		}
	}
	
	


	}

}
