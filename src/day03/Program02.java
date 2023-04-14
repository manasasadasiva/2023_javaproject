package day03;

public class Program02 {

	public static void main(String[] args) {
		addFunction(10,20);
Program02 x=new Program02();
x.subFunction(30,40);
addFunction(20,60);
	}
public static void addFunction(int a,int b)
{
	System.out.println(a+b);
}
public void subFunction(int a,int b)
{
	System.out.println(a-b);
}
}
