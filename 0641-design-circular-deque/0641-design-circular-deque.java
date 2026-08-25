class MyCircularDeque {
    int arr[];
    int front;
    int rear;
    int capacity;
    int size;
    public MyCircularDeque(int k) {
        capacity = k;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    
    public boolean insertFront(int x) {
        if(isFull()){
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = x;
        size++;
        return true;
    }
    
    public boolean insertLast(int x) {
        if(isFull()){
            return false;
        }

          if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = x;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }

           if (size == 1) {
            front = 0;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
          if(isEmpty()){
            return false;
        }

          if (size == 1) {
            front = 0;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */