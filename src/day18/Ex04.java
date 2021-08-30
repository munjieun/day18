package day18;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<StDTO> arr = new ArrayList<StDTO>();
		
		StDTO s = new StDTO();
		s.setName("홍길동"); s.setStNum("학번123");
		
		arr.add(s);
		
		StDTO s1 = new StDTO();
		s1.setName("김개똥"); s1.setStNum("학번222");
		
		arr.add(s1);
		
		System.out.println("arr.0 : " + arr.get(0).getName());
		System.out.println("s : " + s.getName());
		System.out.println("arr.1 : " + arr.get(1).getStNum());
		System.out.println("s1 : " + s1.getStNum());
	}
}
