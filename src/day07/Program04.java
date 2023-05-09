package day07;

public class Program04 {
	int a;
	int b;
	public Program04(int a, int b)
	{
		this.a=a;
		this.b=b;
		this.cal();
	}

	public static void main(String[] args) {
	Program04 happi =new Program04(10,20);
	}
public void add()
{
	System.out.println(a+b);
}
public void sub()
{
	System.out.println(a-b);
}
public void mul()
{
	System.out.println(a*b);
}
public void div()
{
	System.out.println(a/b);
}
public void cal() {
	this.add();
	this.sub();
	this.mul();
	this.div();
}
}