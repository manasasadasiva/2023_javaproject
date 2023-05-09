package day06;

public class Program02 extends Program01 {

	public static void main(String[] args) {
		Program02 pro2= new Program02();
		pro2.cal(10, 5);
		
		Program01 pro1= new Program01();
		pro1.cal(10, 2);

	}
	
	
	@Override
	public void cal(int a,int b)
	{
		System.out.println("Program2 - Calculator");
		System.out.println((a*a)+(b*b));
		System.out.println((a*a)-(b*b));
		System.out.println((a*a)*(b*b));
		System.out.println((a*a)/(b*b));
	}

}