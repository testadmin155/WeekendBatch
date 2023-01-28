package FirstPackage;

public class NestedForLoop {

	public static void main(String[] args) {
		
		
		//1 2 3 4 - row 1 - run 4 times
		//5 6 7 - Row 2 - run 3 times
		//8 9 - Row 3 - run 2 tims
		//10 - Row 4 - 1 time
		
		int k=1;
		for ( int i=0; i<4;i++)
		{
			
			for (int j=1;j<=4-i; j++)
			{
				System.out.print(k+" ");
				System.out.print("\t");
				k++;
			}
			System.out.println("");

		}
		
		
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
		

	}

}
