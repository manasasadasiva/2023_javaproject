package day3;

public class Twodimensionalarray {

	public static void main(String[] args) {
		// Twodimensionalarray
																																																																																																																																																																	int a[][]=new int[3][2];//decalarion of array
																																																																																																																																																																	a[0][0]=10;//storing elements or values array
																																																																																																																																																																	a[0][1]=20;
																																																																																																																																																																	
																																																																																																																																																																	a[1][0]=30;
																																																																																																																																																																	a[1][1]=40;
																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																	a[2][0]=50;
																																																																																																																																																																	a[2][1]=60;
		//classic for loop
for(int i=0;i<=2;i++)//for increment rows
{
	for(int j=0;j<=1;j++)
	{ 
System.out.print(a[i][j]+"  ");//print in same row//+"  " to give space between numbers
	}
{
	System.out.println();//to print 10 20 in different lines

}
	}
}
}

