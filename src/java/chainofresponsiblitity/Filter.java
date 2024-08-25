package src.java.chainofresponsiblitity;

public class Filter {

    private final Activatable current;
    private Filter next = null;

    public String getFilerName() {
        return this.current.getClass().getName();
    }

    Filter(Activatable Activatable) {
        this.current = Activatable;
    }

    public void setNext(Filter filter) {
        this.next = filter;
    }

    public boolean doFilter(Request request) {
        var canActivate = this.current.canActive(request);
        if (!canActivate) {
            System.out.println(STR."Filter::\{this.getFilerName()}, Request::\{request}, FAIL");
            return false;
        }
        if (this.next == null) return true;
        return this.next.doFilter(request);
    }
}
