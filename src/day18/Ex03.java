package day18;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		//자료형 없이 만들면 object 타입으로 만들어져서 모든 자료형을 받을 수 있지만 연산이 불가능하다.
		//따라서 연산을 위해서는 형변환을 시켜주고 몇번째위치에 어떤 자료형의 값이 있는지 알아야 한다.
		arr.add(100);
		arr.add("aaa");
		arr.add(1.1111);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		ArrayList<String> list = new ArrayList<String>();
		//자료형을 저장하면 그 자료형의 값만 add 가능, get으로 값을 불러와도 해당 자료형으로 불러와짐
		list.add("111");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
	}
}
