package BiodomeFamily03;

import BiodomeFamily01.BiodomeFamily01.Organism;
import java.util.*;

public class LifeNest {														// LifeNest 클래스 
	public ArrayList<Organism> organismList = new ArrayList<>();			// ArrayList로 유기체 데이터 관리

    public void addOrganism(Organism organism) {							// ArrayList에 유기체 추가 메서드
        organismList.add(organism);
        System.out.println("[LifeNest] " + organism.getName() + "이(가) 추가되었습니다.");
    }

    public void removeOrganism(Organism organism) {							// ArrayList에 유기체 삭제 메서드
        organismList.remove(organism);
        System.out.println("[LifeNest] " + organism.getName() + "이(가) 삭제되었습니다.");
    }

    public void displayAll() {												// ArrayLsit에 있는 유기체 모든 유기체 정보를 출력해주는 메서드
        System.out.println("유기체 전체 목록 출력:");
        int index = 1;
        for (Organism organism : organismList) {
            System.out.print(index + ". ");
            organism.displayInfo();
            index++;
        }
    }
}
