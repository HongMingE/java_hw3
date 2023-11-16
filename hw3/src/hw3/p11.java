package hw3;

public class p11
{
	public static void main(String[] args)
	{
		Car11 car1;
		car1 = new Car11();
		
		car1.num = 1234;
		car1.gas= 20.5;
		
		car1.show();
		car1.show();
	}
}

//Car類別
class Car11
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是" +this.num);
		System.out.println("汽油量是" +this.gas);
	}
}