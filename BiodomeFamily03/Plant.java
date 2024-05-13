package BiodomeFamily03;

import BiodomeFamily01.BiodomeFamily01.Organism;
import java.util.*;

public class Plant extends Organism {										// Organism 클래스를 상속받은 Plant 클래스 구현
	private String floweringTime;											// Plant의 개화시기 필드를 private를 활용하여 캡슐화
	private boolean fruit;													// Plant의 열매 유무 필드를 private를 활용하여 캡슐화
	
	public Plant (String name, String species, String habitat,String floweringTime,  boolean fruit) {
																			// Plant의 기본 정보를 입력받아 초기화하는 setter 메서드
		
		super(name, species, habitat);										// super 메서드를 통해 부모 클래스의 Organism 생성자 호출
		this.floweringTime = floweringTime;									
		this.fruit = fruit;													
	}
	
    public String getFloweringTime() {										// 식물의 개화시기 데이터를 활용시 개화시기 데이터를 호출하는 getter 메서드
        return floweringTime;
    }

    public String getFruit() {												// 식물의 열매유무 데이터를 활용시 열매유무 데이터를 호출하는 getter 메서드
    	String fruitStatus = fruit ? "열매 있음" : "열매 없음";					// 삼항연산자를 활용하여 if문을 사용하지 않고 열매 유무 판단
        return fruitStatus;
    }
    
    // 오버라이딩
    public void displayInfo() {												// 오버라이딩을 활용하여 식물의 추가적인 필드까지 데이터 출력
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat() + ", " + getFloweringTime() + ", " + getFruit());
    }
}


