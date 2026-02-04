class StockSpanner {

    // stack stores indices of prices
    Stack<Integer> st;
    ArrayList<Integer> prices;
    int idx;

    public StockSpanner() {
        st = new Stack<>();
        prices = new ArrayList<>();
        idx = 0;
    }
    
    public int next(int price) {
        prices.add(price);

        // pop while current price is greater or equal
        while (!st.isEmpty() && prices.get(st.peek()) <= price) {
            st.pop();
        }

        int span;
        if (st.isEmpty()) {
            span = idx + 1;   // all previous days included
        } else {
            span = idx - st.peek();
        }

        st.push(idx);
        idx++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */