package RuleOfBiodome04;

import java.util.*;

public class BiologicalEntity<T> { 														// generic 타입으로 종별 공통 특징 세팅
    private String name;															// 이름 속성에 대한 필드 세팅
    private String classification;													// 종류 속성에 대한 필드 세팅
    private T features;																// 특징 속성에 대한 필드 세팅

    public BiologicalEntity(String name, String classification, T features) { 		// 유기체의 이름, 종류, 특징등의 정보를 입력받아 초기화하는 setter 메서드
        this.name = name;
        this.classification = classification;
        this.features = features;
    }
    
    public String getName() {														// 유기체의 이름 데이터를 불러오는 getter 메서드
        return name;
    }
    public String getClassification() {												// 유기체의 종류 데이터를 불러오는 getter 메서드
        return classification;
    }
    public T getFeatures() {														// 유기체의 특징 데이터를 불러오는는 getter 메서드
        return features;
    }

    //오버라이딩
    public String toString() {					// 기존 toString은 데이터 출력이 직관적이지 않으므로 오버라이딩하여 직관적인 정보들을 출력하는 toString 메서드 선언
        return String.format("%s, %s, %s", name, classification, features.toString());
    }
}

