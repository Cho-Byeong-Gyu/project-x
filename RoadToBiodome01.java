package RoadToBiodome01;

import java.util.*;

public class RoadToBiodome01 {									// 메인 메서드
	public static void main(String[] args) {
		
		ArrayList<Integer> List = new ArrayList<>();			// ArrayList를 활용하여 List변수 선언
		for (String arg : args) {								// foreach문을 활용하여 list 내부 값에 모두 접근
			arg = arg.replaceAll(",", ""); 						// 콤마 문자 예외처리
			int num = Integer.parseInt(arg);					// List의 객체들에 저장할 입력받은 값을 숫자로 변환하여 num변수에 담아둠
			if (num < 0 || num > 1000) {						// 변환처리된 숫자들중에서 0~1000 사이의 범위를 벗어나는 값이 있다면 예외처리
				System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
				return;
			}
//			System.out.println(num);	--> 변환처리 테스트
			List.add(num);										// 숫자로 변환하여 담아두었떤 num값을 List의 객체들로 추가
		}
//		System.out.println(List);		--> 변환처리 테스트
		
		 int Result = FindIndex(List);					
		 // 입력받은 값을 저장한 List 배열의 값을 보내며 1번만 반복한 값을 찾는 메서드인 FindIndex 메서드를 호출
         
         if (Result != -1) {		
             System.out.println(Result);
         } else {
             System.out.println("1번만 반복된 파동수가 존재하지 않습니다.");
         }
         // 메서드 선언시 int값을 반환받아야되는데 이를 처리하기 위해만든 -1일때의 예외처리를 위한 if문
	}
	
	
	private static int FindIndex (ArrayList<Integer> List) {
        int[] counts = new int[1001];  
        for ( int arg : List) {
            counts[arg]++;
        }
        // 길이 1000짜리 배열을 활용하여 반복는되는 값과 같은 index의 값을 증가시키며 중복되는 횟수 카운팅, 이게 1인걸 찾기

        
        for (int i = 0; i < counts.length; i++) {	
            if (counts[i] == 1) {  									// 한 번만 반복한 값 찾기
                return i;
            }
        }
        return -1;													// 한번만 반복한 값이 없다면 -1을 반환 -> 반환형 맞춰주기 위함
    }
	
}







