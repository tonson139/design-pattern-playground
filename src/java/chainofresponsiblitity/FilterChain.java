package src.java.chainofresponsiblitity;

public class FilterChain implements Activatable {

    private final Filter firstFilter;

    @Override
    public boolean canActive(Request request) {
        return firstFilter.doFilter(request);
    }

    public static class FilerBuilder {
        public FilerBuilder() {
        }

        private Filter entryFilter = null;
        private Filter currentFilter = null;

        public FilerBuilder setNextFilter(Activatable e) {
            var newFilter = new Filter(e);
            if (currentFilter == null) {
                this.entryFilter = newFilter;
                this.currentFilter = newFilter;
                return this;
            }
            this.currentFilter.setNext(newFilter);
            this.currentFilter = newFilter;
            return this;
        }

        public FilterChain build() {
            return new FilterChain(entryFilter);
        }
    }

    private FilterChain(Filter firstOfChain) {
        this.firstFilter = firstOfChain;
    }
}
