package HelloBiodome01;

import java.util.*;

public class HelloBiodome01 {								

	public static void main(String[] args) {		// main메서드
		
		if(args.length < 1) {		// 이름을 입력하지 않았을 때 배열의 길이가 0인것을 이용하여 에외처리
			System.out.printf("이름을 입력하지 않으셨습니다. 다시 입력해주세요.");
		}
		else {								
			String name = "";						// String타입의 name 변수 초기화 선언
			for(int i=0; i<args.length; i++) {		
				name = name.concat(args[i]);		// String 메서드중 새로운 문자열을 기존 문자열에 더해주는 concat메서드를 활용하여 
													//사용자가 띄워쓰기를 입력하여 한글자씩 arguments배열에 저장되어도 name변수에 전체이름을 저장
			}
			System.out.printf("%s님 스프링와트에 오신걸 환영합니다.", name); // 기본 입출력 메서드중 printf를 활용하여 환영문구 출력하기
		}
	}
}
