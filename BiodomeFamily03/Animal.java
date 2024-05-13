package BiodomeFamily03;

import BiodomeFamily01.BiodomeFamily01.Organism;
import java.util.*;

public class Animal extends Organism {										// Organism 클래스를 상속받은 Animal 클래스 구현
	private String extinguishMethod;										// Animal의 소화방식 필드를 private를 활용하여 캡슐화
	private String feed;													// Animal의 먹이 필드를 private를 활용하여 캡슐화
	
    public Animal(String name, String species, String habitat, String extinguishMethod, String feed){ 
    																		// Animal의 기본 정보를 입력받아 초기화하는 setter 메서드

    	super(name, species, habitat);										// super 메서드를 통해 부모 클래스의 Organism 생성자 호출
        this.extinguishMethod = extinguishMethod;
        this.feed = feed;
    }

    public String getExtinguishMethod() {									// 동물의 소화 방식에 대한 데이터를 활용시 소화방식 데이터를 호출하는 getter 메서드
        return extinguishMethod;
    }

    public String getFeed() {												// 돌물의 먹이에 대한 데이터를 활용시 먹이 데이터를 호출하는 getter 메서드
        return feed;
    }
    
    // 오버라이딩
    public void displayInfo() {												// 오버라이딩을 활용하여 동물의 추가적인 필드까지 데이터 출력
    	System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat() + ", " + getExtinguishMethod() + ", " + getFeed());
    }

}