package BiodomeFamily03;

import java.util.*;

public class Oraganism {
	public static class Organism {												// Organism 클래스
		private String name;													// 유기체의 이름 필드를 private를 활용하여 캡슐화
		private String species;													// 유기체의 종 필드를 private릏 활용하여 캡슐화
		private String habitat;													// 유기체의 서식지 필드를 private를 활용하여 캡슐화
	
		
	    public Organism(String name, String species, String habitat) {		// 유기체의 기본 정보를 입력받아 클래스의 객체를 불러오는 setter 메서드
	        this.name = name;
	        this.species = species;
	        this.habitat = habitat;
	    }
	    
	    public String getName() {												// 유기체 이름 데이터 활용시 이름 데이터를 호출하는 getter 메서드 
	        return name;
	    }

	    public String getSpecies() {											// 유기체의 종 데이터 활용시 종 데이터를 호출하는 getter 메서드
	        return species;
	    }

	    public String getHabitat() {											// 유기체의 서식지 데이터를 활용시 서식지 데이터를 호출하는 getter 메서드
	        return habitat;
	    }

	    public void displayInfo() {												// 이름, 종, 서식지의 데이터를 출력해주는 메서드
	        System.out.println(name + ", " + species + ", " + habitat);
	    }
	}
	
}
