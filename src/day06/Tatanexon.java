package day06;

public class Tatanexon extends
Tatacarspec{
   public static void main(String[] args){
	Tatanexon nexon= new Tatanexon();
		nexon.displayHeight();
		nexon.displayPrice();
		nexon.displaySpeed();
		}
		@Override
			public void displayHeight()
			{
				System.out.println("Tatanexon Height is 5.5f");
			}
		@Override
		public void displayWidth()
			{
				System.out.println("Tatanexon Width is 7f");
			}
		@Override	
		public void displaySpeed()
			{
				System.out.println("Tatanexon Speed is 120KM/HR");
			}
		@Override
		public void displayPrice()
			{
				System.out.println("Tatanexon Price is 10.5L");
			}
				



			}

	