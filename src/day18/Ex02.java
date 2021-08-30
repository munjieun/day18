package day18;

class Print02<T>{
	//<>이렇게 만들면 원하는 형태를 그때그때 지정해줄 수 있다.
	//꺽쇠 안에 T를 가져다 쓰는곳은 다 같은 형태라고 보면 된다.
	//제네릭이란 꺽쇠안에 자료형을 가져다 쓰는 것을 말한다.
	//ex) arraylist
	public void print(T a, T b) {
		System.out.println(a + ", " + b);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Print02<String> p = new Print02<>();
		p.print("안녕", "반가워");
		Print02<Integer> pp = new Print02<>();
		//안에 int는 사용불가, int의 클래스 형태인 Integer 사용해야 함
		pp.print(100, 200);
	}
}
