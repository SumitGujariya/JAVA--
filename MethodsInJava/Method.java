package MethodsInJava;


/**
class Calculator{
	int a; // This one is instant variables.
	public int add(int n1, int n2)
	{
		int r=n1+n2; // This is we called local variables.
		return r;
	}
}

public class Demo {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		Calculator calc = new Calculator();
		int result = calc.add(num1, num2);
		System.out.println(result);
	}
}
	**/

class Computer{
	public void playMusic() {

		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost) {
		
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}
}


public class Method {
	public static void main(String[] args) {
		Computer obj = new Computer(); // Here's (obj) is refrence variables.
		obj.playMusic();
		String src = obj.getMeAPen(10);
		System.out.println(src);
	}
}