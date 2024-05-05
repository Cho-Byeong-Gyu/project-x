package HelloBiodome04;

import java.util.*;

public class HelloBiodome04 {

	private static final double Temp_min = 10;								// 적정 온도 범위 최소값
	private static final double Temp_max = 27.5;							// 적정 온도 범위 최대값
	private static final double Humi_min = 40;								// 적정 습도 범위 최소값
	private static final double Humi_max = 60;								// 적정 습도 범위 최대값
	private static final double Oxyg_min = 19.5;							// 적정 산소 범위 최소값
	private static final double Oxyg_max = 23.5;							// 적정 산소 범위 최대값

    public static void main(String[] args) {								// 메인 메서드
    
    
		if(args.length < 3) {						// 3개의 데이터를 모두 입력하지 않았을 때를 if문으로 예외처리
			System.out.println("입력하지 않은 데이터가 존재합니다. 다시 입력해주세요.");
		}
		else {
			String regex = "^[0-9]+$";
			
			if(args[0].matches(regex) && args[1].matches(regex) && args[2].matches(regex)) {			
				// 입력한 데이터가 숫자가 아닐 때 정규식을 활용하여 입력받는 문자열의 종류를숫자로만 한정지어 예외외처리

				double Temp = Double.parseDouble(args[0]);					
				double Humi = Double.parseDouble(args[1]);
				double Oxyg = Double.parseDouble(args[2]);
	
				if(TempHealth(Temp) == false) {			// 1가지만 정상 범위를 벗어날 수 있다고 가정하기에 한개의 조건문으로 예외처리
					System.out.println("온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다");
				}
				else if(HumiHealth(Humi) == false) {
					System.out.println("습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다");
				}
				else if(OxygHealth(Oxyg) == false){
					System.out.println("산소값이 정상 범위를 벗어났습니다. 확인이 필요합니다");
				}else {
					System.out.println("생명의 나무는 안정적인 상태입니다. ");	// 세 가지 모두 boolean 반환값이 true라면 안정적이므로 안정적이라는 문구 출력
				}
			}
			else {
				System.out.println(" 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
			}
	    }
	}
    
    public static boolean TempHealth(double T) {			// 온도값이 안정적인지 판단하여 boolean 형태로 반환하는 함수
    	
		if(Temp_min <= T && T <= Temp_max) {
			return true;
		}else {
			return false;
		}
    }
    public static boolean HumiHealth(double H) {			// 습도값이 안정적인지 판단하여 boolean 형태로 반환하는 함수
    	
		if(Humi_min <= H && H <= Humi_max) {
			return true;
		}else {
			return false;
		}
    }
    public static boolean OxygHealth(double O) {			// 산소값이 안정적인지 판단하여 boolean 형태로 반환하는 함수
    	
    	if(Oxyg_min <= O && O <= Oxyg_max) {
    		return true;
    	}else {
    		return false;
    	}
    }
}