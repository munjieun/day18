package day18;

class Print{
	public void print(int a, int b) {
		System.out.println(a + ", " + b);
	}
	public void print(String a, String b) {
		System.out.println(a + ", " + b);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Print p = new Print();
		p.print(10, 20);
		p.print("문자", "출력");
	}
}
