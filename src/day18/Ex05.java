package day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StDTO> list = new ArrayList<StDTO>();
		//StDTO dto = new StDTO();
		String name, stNum;
		int num;
		while(true) {
			System.out.println("1.등록  2.보기  3.종료");
			num = input.nextInt();
			switch(num) {
			case 1 :
				System.out.println("학번 입력");
				stNum = input.next();
				System.out.println("이름 입력");
				name = input.next();
				//아래처럼 하면 1번을 선택할때마다 new를 만나 새로운 dto 객체가 생성됨
				//반복문 밖에 선언하면 같은 공간 안에 num, name의 값이 계속 새로운 값으로 바뀌면서 마지막 값만 저장되게 된다.
				//따라서 add(dto)에는 dto 객체의 공간 주소가 저장되므로,
				//해당 공간의 num, name값은 마지막 값만 저장되어 있으므로 마지막 값만 보이게 된다.
				StDTO dto = new StDTO();
				dto.setStNum(stNum);
				dto.setName(name);
				
				list.add(dto);
				break;
			case 2 :
				System.out.println("--- 모든 정보 보기 ---");
				for(int i=0; i<list.size(); i++) {
					//StDTO s = list.get(i);
					//System.out.println(s.getStNum());
					System.out.println("객체 : " + list.get(i));
					System.out.println("학번 : " + list.get(i).getStNum());
					System.out.println("이름 : " + list.get(i).getName());
					System.out.println("--------------------");
				}
				break;
			case 3 :
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
