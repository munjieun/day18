package day18;

import java.util.ArrayList;
import java.util.HashMap;

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
		
		HashMap<String, StDTO> map = new HashMap<String, StDTO>();
		StDTO st = new StDTO();
		st.setName("홍길순"); st.setStNum("학번333");
		
		StDTO st1 = new StDTO();
		st1.setName("홍길남"); st1.setStNum("학번444");
		
		map.put(st.getStNum(), st);
		map.put(st1.getStNum(), st1);
		
		System.out.println("st 객체 : " + map.get("학번333"));
		//StDTO dto = map.get("학번333");
		//System.out.println(dto.getName());
		System.out.println("st 학번 : " + map.get("학번333").getStNum());
		System.out.println("st 이름 : " + map.get("학번333").getName());
	}
}
