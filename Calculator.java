package week1.day2;

public class Calculator {

	public int add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
		return num1+num2+num3;
	}
	public int sub(int num1,int num2) {
		System.out.println(num1-num2);
		return num1-num2;
	}
	public double mul(double num1,double num2) {
		System.out.println(num1*num2);
		return num1*num2;
	}
	public float divide(float num1, float num2) {
		System.out.println(num1/num2);
		return num1/num2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calculator obj1=new Calculator();
	obj1.add(3,5,2);
	obj1.sub(5,3);
	obj1.mul(5,2.5);
	obj1.divide(100,30);
	}

}
