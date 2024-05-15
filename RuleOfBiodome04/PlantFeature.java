package RuleOfBiodome04;

public class PlantFeature {
    private String flowerColor;
    private boolean hasFruit;
    private String bloomPeriod;

    public PlantFeature(String flowerColor, boolean hasFruit, String bloomPeriod) {
        this.flowerColor = flowerColor;
        this.hasFruit = hasFruit;
        this.bloomPeriod = bloomPeriod;
    }

    @Override
    public String toString() {
        return "Flower Color: " + flowerColor + ", Has Fruit: " + hasFruit + ", Bloom Period: " + bloomPeriod;
    }
}