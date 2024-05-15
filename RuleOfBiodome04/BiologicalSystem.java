package RuleOfBiodome04;

import java.util.*;

public class BiologicalSystem<T> {															// 유기체 데이터 관리하는 클래스
    public List<BiologicalEntity<T>> entities = new ArrayList<>();

    public void add(BiologicalEntity<T> entity) {									// 유기체 정보를 추가하는 메서드
        entities.add(entity);
        System.out.println("새로운 생물이 등록되었습니다 : " + entity.getName());
    }
    
    public void delete() {															// 유기체 정보를 삭제하는 메서드
        if (!entities.isEmpty()) {
            BiologicalEntity<T> entity = entities.remove(entities.size() - 1);
            System.out.println("생물이 삭제 되었습니다 : " + entity.getName());
        }
    }

    public void clear() {															// 모든 유기체들의 정보를 삭제하는 메서드 
        entities.clear();
        System.out.println("모든 정보를 삭제했습니다.");
    }

    public void show() {															// 현재 유기체 정보를 출력해주는 메서드
        if (!entities.isEmpty()) {
            System.out.println("최신 등록 생물 : " + entities.get(entities.size() - 1));
        }
    }

    public boolean isEmpty() {														// 유기체 정보 비어있는지 확인하는 메서드
        return entities.isEmpty();
    }
}