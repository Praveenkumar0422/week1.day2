package week1.day2;

public class MyMobile {
static long mobileNumber=9840290246l;
static boolean isMobileSwitchOff=false;
static int num=1234;
static char name='p';
public void makeCall() {
	System.out.println("make call");
}
public void sendMsg() {
System.out.println(" send message");
}
private void payBills() {
System.out.println("pay my bill");
}
public static void main(String[]args) {
	System.out.println(mobileNumber);
	System.out.println(isMobileSwitchOff);
	System.out.println(num);
	System.out.println(name);
	MyMobile obj=new MyMobile();
	obj.makeCall();
	obj.sendMsg();
	obj.payBills();
}
}
