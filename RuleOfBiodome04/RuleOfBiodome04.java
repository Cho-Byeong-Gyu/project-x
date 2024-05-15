package RuleOfBiodome04;

import java.util.*;


public class RuleOfBiodome04 {
	public static void main(String[] args) {
	    BiologicalSystem<AnimalFeature> animalSystem = new BiologicalSystem<>();								// 동물 객체를 저장할 ArrayList 세팅
	    BiologicalSystem<PlantFeature> plantSystem = new BiologicalSystem<>();									// 식물 객체를 저장할 ArrayList 세팅
	    BiologicalSystem<MicrobeFeature> microbeSystem = new BiologicalSystem<>();								// 미생물 객체를 저장할 ArrayList 세팅
	    
	    animalSystem.add(new BiologicalEntity<>("고양이", "동물", new AnimalFeature("귀여움", "포유류", "20년")));		// 고양이에 대한 정보 추가
	    animalSystem.add(new BiologicalEntity<>("얼룩말", "동물", new AnimalFeature("잘 달린다", "포유류", "10년")));		// 얼룩말 객체 추가
	    plantSystem.add(new BiologicalEntity<>("로즈마리", "식물", new PlantFeature("보라색", false, "7월")));			// 로즈마리 객체 추가
	    plantSystem.add(new BiologicalEntity<>("벚꽃", "식물", new PlantFeature("분홍색", true, "3월")));				// 벚꽃 객체 추가
	    microbeSystem.add(new BiologicalEntity<>("이콜라이", "미생물", new MicrobeFeature("약 산성", "호흡 및 발효 대사")));	// 이콜라이 객체 추가
	    microbeSystem.add(new BiologicalEntity<>("바실러스", "미생물", new MicrobeFeature("약 산성", "호흡 및 발효 대사")));	// 바실러스에 객체 추가

	    
	    animalSystem.show();
	    plantSystem.show();
	    microbeSystem.show();
	    animalSystem.delete();
	    plantSystem.delete();
        microbeSystem.delete();
        animalSystem.clear();
        plantSystem.clear();
        microbeSystem.clear();
        System.out.println("동물 정보 리스트가 " + (animalSystem.isEmpty() ? "비어 있음." : "비어있지 않음."));
        System.out.println("삭물 정보 리스트가 " + (plantSystem.isEmpty() ? "비어 있음." : "비어있지 않음."));
        System.out.println("미생물 정보 리스트가 " + (microbeSystem.isEmpty() ? "비어 있음." : "비어있지 않음."));
	}
}


