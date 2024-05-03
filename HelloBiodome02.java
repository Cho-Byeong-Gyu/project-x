package HelloBiodome02;

import java.util.*;

public class HelloBiodome02 {

	public static void main(String[] args) {
		
		int SunE = Integer.parseInt(args[0]);
		int WindE = Integer.parseInt(args[1]);
		int GeothermalE = Integer.parseInt(args[2]);
		
		int sum = SunE + WindE + GeothermalE;
		
		double SunErate = (double)SunE / (double)sum * 100.0;
		double WindErate = (double)WindE / (double)sum * 100.0;
		double GeothermalErate = (double)GeothermalE / (double)sum * 100.0;
		
		System.out.println("태양광에너지 생산량: "+SunE);
		System.out.println("풍력에너지 생산량: "+WindE);
		System.out.println("지열에너지 생산량: "+GeothermalE);
		System.out.printf("전체 에너지 생산량은 %d입니다. \n", sum);
		
		System.out.println("태양광에너지 생산량 비율: "+ SunErate+"%");
		System.out.println("풍력에너지 생산량 비율: "+ WindErate+"%");
		System.out.println("지역에너지 생산량 비율: "+ GeothermalErate+"%");
	}
}
