package day07;

public class Program03 {
	public Program03()
	{
		System.out.println("testing");
	}
	public Program03(String message)
	{
		System.out.println("manasa");
	}
	
	public Program03(int a,int b)
	{
		System.out.println(a);
	}
     public static void main(String[] args) {
		Program03 happy =new Program03("good evening");
        happy.display();
	}
	public void display()
	{
		System.out.println("good day$");
	}
}

