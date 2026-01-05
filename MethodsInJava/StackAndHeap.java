package MethodsInJava;

class Calculator
{
	int num=5;
	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;
	}
}


public class StackAndHeap {
	public static void main(String[] args) {
		int data = 10;
		System.out.println(data); // It's only use for remove the error ignore this line.
		Calculator obj = new Calculator();
		Calculator obj1 = new Calculator();
		int r1 = obj.add(3,4);
		System.out.println(r1);
		obj.num = 8;
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
}