package BiodomeFamily01;

import java.util.*;

public class BiodomeFamily01 {

	public static class Organism {													// 동식물 객체 Organism 선언
	
	    private String name;
	    private String species;
	    private String habitat;
	
	    public Organism(String name, String species, String habitat) {
	        this.name = name;
	        this.species = species;
	        this.habitat = habitat;
	    }
	
	    public void displayInfo() { 											// 동식물 데이터 출력 메서드
	        System.out.println(name + ", " + species + ", " + habitat);
	    }
	
	    	
	    public String getName() {												// 동식물 이름 불러오는 메서드
	        return name;
	    }
	
	    public String getSpecies() {											// 동식물 종 불러오는 메서드
	        return species;
	    }
	
	    public String getHabitat() {											// 동식물 서식지 불러오는 메서드
	        return habitat;	
	    }
	
	}


	public static class LifeNest {
		public ArrayList<Organism> organismList = new ArrayList<>();
	
		 public void addOrganism(Organism organism) {							// 동식물 객체 추가 메서드
		     organismList.add(organism);
		     System.out.println("[LifeNest] " + organism.getName() + "이(가) 추가되었습니다.");
		 }

		 public void removeOrganism(String name) {								// 동식물 객체 삭제 메서드
		     organismList.removeIf(organism -> {
		     boolean isMatch = organism.getName().equals(name);
		     if (isMatch) {
		         System.out.println("[LifeNest] " + name + "이(가) 삭제되었습니다.");
		     }
		     
		     return isMatch;
		     });
		 }

		 public void displayInfo() {									// 동식물 전체 리스트 출력 메서드
		     System.out.println("전체 동식물 목록 출력:");
		     int index = 1;
		     for (Organism organism : organismList) {
		         System.out.println(index++ + ". " + organism.getName() + ", " + organism.getSpecies() + ", " + organism.getHabitat());
		     }
	 	 }
	}
	
	public static void main(String[] args) {							// main 메서드
		
		LifeNest lifeNest = new LifeNest();								// LifeNest 객체 선언
		
		Organism penguin = new Organism("펭귄", "동물", "남극");				// Organism 클래스에 펭귄 객체 생성
		Organism koala = new Organism("코알라", "동물", "호주");				// Organism 클래스에 코알라 객체 생성
		Organism cactus = new Organism("선인장", "식물", "사막");				// Organism 클래스에 선인장 객체 생성
		Organism peppermint = new Organism("페퍼민트", "식물", "정원");		// Organism 클래스에 페퍼민트 객체 생성
	  
	     lifeNest.addOrganism(penguin);									// ArrayList에 펭귄 객체 추가
	     lifeNest.addOrganism(koala);									// ArrayList에 코알라 객체 추가
	     lifeNest.addOrganism(cactus);									// ArrayList에 선인장 객체 추가
	     lifeNest.addOrganism(peppermint);								// ArrayList에 페퍼민트 객체 추가
	
	     lifeNest.displayInfo();										// ArrayList에 있는 개체정보 출력
	
	     lifeNest.removeOrganism("펭귄");									// ArrayList에 저장되어있는 펭귄 객체 제거
	     lifeNest.removeOrganism("페퍼민트");								// ArrayList에 저장되어있는 페퍼민트 객체 제거
	
	
	     lifeNest.displayInfo();										// ArrayList에 있는 개체정보 출력
	}
}
