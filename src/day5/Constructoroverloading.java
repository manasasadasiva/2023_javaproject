package day5;

public class Constructoroverloading {
	int a=0;
	int b=0;
	double c=0;
	Constructoroverloading()
	{
		a=10;
		b=20;
		c=20.5;
	}
	Constructoroverloading(int x,int y)
	{
		a=x;
		b=y;
	}
	Constructoroverloading(int x,int y,double z)
	{
		a=x;
		b=y;
		c=z;
	}
	void display()//to display first one
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}

	public static void main(String[] args) {
		// Constructoroverloading ce=new  Constructoroverloading();
		// ce.display();//
	//	 Constructoroverloading ce=new  Constructoroverloading(100,200);second constructor
		Constructoroverloading ce=new  Constructoroverloading(100,200,20.5);
		 ce.display();
		

	}

}
