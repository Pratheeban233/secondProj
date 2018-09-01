package Test;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner=new Scanner(System.in);
		Scanner.nextInt();*/
		for (int row = 1; row <= 3; row++) {
			for (int col1 = 1; col1 <= 3; col1++) {
				System.out.print("*");
			}
			{
				for (int sp1 = 2; sp1 > 1; sp1--) {
					System.out.print(" ");
				}
				{
					for (int sp2 = 1; sp2 < row;) {
						if (row != 3) {
							System.out.print(" ");
						}
						if (row == 1 && row == 2) {
							System.out.print("*");
						}
						{
							for (int col2 = 2; col2 <= 3; col2++) {
								System.out.print("*");
							}
							System.out.println();
						}
					}
					{

					}
				}
			}
		}
	}

}
