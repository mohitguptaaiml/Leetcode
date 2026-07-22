class CustomStack {
    int top;
    int capacity;
    int[] arr;
    public CustomStack(int maxSize) {
        top = -1;
        capacity = maxSize;
        arr = new int[capacity];
    }
    
    public void push(int x) {
        if(top == capacity -1){
            return;
        }
        arr[++top] = x;
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        return arr[top--];
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, top + 1);

        for (int i = 0; i < limit; i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */