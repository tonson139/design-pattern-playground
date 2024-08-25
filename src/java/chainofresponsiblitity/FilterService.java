package src.java.chainofresponsiblitity;

import java.util.List;

public class FilterService {

    public static void main(String[] args) {
        var filter1 = new RequestMethodFilter();
        var filter2 = new RequestUrlFilter();
        var filter3 = new RequestBodyFilter();

        var filterChainValidate = new FilterChain.FilerBuilder()
                .setNextFilter(filter1)
                .setNextFilter(filter2)
                .setNextFilter(filter3)
                .build();

        var filterChain = new FilterChain.FilerBuilder()
                .setNextFilter(filterChainValidate) // filterChain can be composed like filter
                .setNextFilter(new LoggingFilter())
                .build();

        var requests = List.of(
                new Request("PASS", "PASS", "PASS"),
                new Request("FAIL", "PASS", "PASS"),
                new Request("PASS", "FAIL", "PASS"),
                new Request("PASS", "PASS", "FAIL")
        );

        for (Request req : requests) {
            System.out.println(STR." ===> Request=\{req} canActivte=\{filterChain.canActive(req)}");
        }
    }
}
