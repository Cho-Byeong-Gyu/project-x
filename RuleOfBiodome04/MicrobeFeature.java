package RuleOfBiodome04;

public class MicrobeFeature {
    private String livingEnvironment;							// 생활 환경에 대한 필드 세팅
    private String metabolismType;								// 대사 방식에 대한 필드 세팅

    public MicrobeFeature(String livingEnvironment, String metabolismType) {
        this.livingEnvironment = livingEnvironment;
        this.metabolismType = metabolismType;
    }

    @Override
    public String toString() {
        return "Living Environment: " + livingEnvironment + ", Pathogenic: " + ", Metabolism: " + metabolismType;
    }
}