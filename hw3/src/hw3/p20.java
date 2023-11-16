package hw3;

public class p20
{
	public static void main(String[] args)
	{
		Car20 car1;
		car1 = new Car20();
		
		
		car1.num = 1234;
		car1.gas= -10;

		car1.show();
	}
}

//Car類別
class Car20
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是" +this.num);
		System.out.println("將車號設為" +this.gas);
	}
}