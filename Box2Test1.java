package chapter;
Box2
{
int width = 10;
int height = 20;
int depth = 30;
}

public class Box2Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
int myint1 =100;
int myint2 =myint1;

System.out.println("첫 번째 값 : " + myint1 +"두 번째 값:"+myint2);
myint1 =200;
System.out.println("첫 번째 값 : " + myint1 +"두 번째 값:"+myint2);

Box2 myBox1 = new Box2();
Box2 myBox2 = new Box2();

myBox1.width = 20;

	}

}
