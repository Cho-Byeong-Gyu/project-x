package BiodomeFamily03;

import java.util.*;

import BiodomeFamily01.BiodomeFamily01.Organism;

public class BiodomeFamily03 {	
	
    public static void main(String[] args) {									// main 메서드
        LifeNest lifeNest = new LifeNest();

        Animal penguin = new Animal("펭귄", "동물", "남극", "육식", "물고기");			// Animal 클래스에 펭귄 객체 추가
        Animal koala = new Animal("코알라", "동물", "호주", "초식", "유칼립투스");			// Animal 클래스에 코알라 객체 추가
        Plant cactus = new Plant("선인장", "식물", "사막", "11월", true);				// Plant 클래스에 선인장 객체 추가
        Plant peppermint = new Plant("페퍼민트", "식물", "정원", "7월", false);		// Plant 클래스에 페퍼민트 객체 추가

        lifeNest.addOrganism(penguin);											// 유기체 데이터를 관리하는 ArrayList에도 객체 추가
        lifeNest.addOrganism(koala);
        lifeNest.addOrganism(cactus);
        lifeNest.addOrganism(peppermint);

        lifeNest.displayAll();													// ArrayList에 존재하는 전체 유기체 데이터들 출력

        lifeNest.removeOrganism(koala);											// 일부 객체들 제거
        lifeNest.removeOrganism(cactus);

        lifeNest.displayAll();													// 제거확인용, 전체 유기체 데이터들 재출력
    }

}
