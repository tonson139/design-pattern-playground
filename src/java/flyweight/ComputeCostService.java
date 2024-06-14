package src.java.flyweight;

import java.util.*;
import java.util.stream.IntStream;

public class ComputeCostService {

    static List<Map<String, String>> tenantWithPlan = new ArrayList<>();
    static String COMPANY_NAME = "companyName";
    static String SUBSCRIPTION_PLAN = "subscriptionPlan";

    public static void main(String[] args) {
        String[] companyList = {"A", "B", "C", "D", "E"};
        String[] planList = {"Basic", "Basic plus", "Basic", "Basic", "Premium"};
        IntStream.rangeClosed(0, companyList.length - 1).forEach(idx -> addCompanyList(companyList[idx], planList[idx]));

        var subscription = new SubscriptionFactory();

        tenantWithPlan.stream().forEach(it ->
                System.out.println(subscription.getSubscription(it.get(SUBSCRIPTION_PLAN)).computeCost(it.get(COMPANY_NAME))));
        System.out.println(STR."tenantWithPlan: \{tenantWithPlan.size()}");
        System.out.printf(STR."subscripton: \{subscription.getSubscriptionLength()}");

    }

    public static void addCompanyList(String name, String plan) {
        Map<String, String> map1 = new HashMap<>();
        map1.put(COMPANY_NAME, name);
        map1.put(SUBSCRIPTION_PLAN, plan);
        tenantWithPlan.add(map1);
    }
}
