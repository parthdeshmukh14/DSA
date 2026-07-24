class RecentCounter {
    Queue<Integer>q1;
    public RecentCounter() {
        q1=new ArrayDeque<>();
    }
    
    public int ping(int t) {
       q1.offer(t);
       while(q1.peek() < t-3000){
        q1.poll();
       }
       return q1.size();
    }

}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */