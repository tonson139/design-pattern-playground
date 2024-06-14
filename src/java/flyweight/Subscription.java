package src.java.flyweight;

public class Subscription {
    private String planName;

    public Subscription(String planName) {
        this.planName = planName;
    }

    public String computeCost(String companyName) {
        return STR."companyName=\{companyName}, Plan: \{planName}";
    }
}
