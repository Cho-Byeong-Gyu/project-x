package HelloBiodome03;

import java.util.*;

public class HelloBiodome03 {
	
	private static final double Pi = 3.14;			// final을 이용하여 Pi에 상수 3.14 고정
	private static double H = 0.0;					// static 변수로 H선언 - 생명지수 계산 메서드에서 활용함

	public static void main(String[] args) {
		
		if(args.length < 3) {						// 3개의 데이터를 모두 입력하지 않았을 때를 if문으로 예외처리
			System.out.printf("입력하지 않은 데이터가 존재합니다. 다시 입력해주세요 \n");
		}
		else {					
		    String regex = "^[0-9]+$";
		    
		    if(args[0].matches(regex) && args[1].matches(regex) && args[2].matches(regex)) {			
		    	// 입력한 데이터가 숫자가 아닐 때 정규식을 활용하여 입력받는 문자열의 종류를숫자로만 한정지어 예외외처리
		    	
		    	double Temp = Double.parseDouble(args[0]);
		    	double Humi = Double.parseDouble(args[1]);
		    	double Oxyg = Double.parseDouble(args[2]);
		    	
		    	
		    	H_calcul(Temp, Humi, Oxyg);
		    	System.out.printf("현재 생명지수는 %.2f입니다. \n", H);
		    }
		    else {
		    	System.out.println("숫자만 입력가능합니다. 다시 입력해주세요.\n");
		    }
		}
	}
	
	private static double H_calcul (double Temp, double Humi, double Oxyg) {		// 생명지수 계산 메서드
		
		H = (0.415 * absolute_value(root_calcul(Humi)- Temp)) + (Oxyg/(Pi*Pi)) ;
		
		return H;
	}
	
	private static double root_calcul (double a) {				// 루트 계산 메서드
		double i = 0.00;
		
		while((i*i) <= a) {	
			i += 0.01;
		}
		return i;
	}
	
	private static double absolute_value (double a) {			// 절댓값 메서드
		if( a < 0) {
			a = -a;
		}
		return a;
	}
	

}
