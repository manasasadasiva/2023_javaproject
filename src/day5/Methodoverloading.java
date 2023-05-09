package day5;

public class Methodoverloading {
	int a;
	int b;
	
	void sum()//first without parameters
	
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sum(int x, int y)//second with 2 parameters
	{
	a=x;
	b=y;
	
		System.out.println(a+b);
	}
	void sum(int x,int y,int z)//third with 3 parameters
	{
		System.out.println(x+y+z);
	}
	void sum(int x,double y)//fourth with df datatype
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
	Methodoverloading me=new Methodoverloading();
	me.sum();//first method
	me.sum(100,200);//second method
	me.sum(100,200,300);//third method
	me.sum(100,10.5);//fourth method
	

	}

}
