package Test;

public class array_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][][][][] student=new int[5][5][5][5][5];
int count;
for(int sta=1;sta<5;sta++)
{
	for(int dis=1;dis<5;dis++)
	{
		for(int sch=1;sch<5;sch++)
		{
			for(int stu=1;stu<5;stu++)
			{
				for(int mar=1;mar<5;mar++)
				{
					count=student [sta][dis][sch][stu][mar];
					System.out.println(count);
				}
			}
		}
	}
}
	}

}
