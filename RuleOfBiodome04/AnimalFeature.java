package RuleOfBiodome04;

public class AnimalFeature {
    private String behavior;								// 행동 특징에 대한 필드 세팅
    private String reproductionMethod;						// 번식 방법에 대한 필드 세팅
    private String lifespan;								// 평균 수명에 대한 필드 세팅

    public AnimalFeature(String behavior, String reproductionMethod, String lifespan) {
        this.behavior = behavior;
        this.reproductionMethod = reproductionMethod;
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        return "Behavior: " + behavior + ", Reproduction: " + reproductionMethod +
               ", Predator: " + ", Prey: " + ", Lifespan: " + lifespan + " years";
    }
}
