package demo;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(10, 20);
		calculator.subtract(30, 20);
		calculator.multiply(10, 10);
		calculator.divide(2, 10);
	}
}
