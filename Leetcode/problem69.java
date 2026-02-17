package Leetcode;

public class problem69 {

    class MyCircularQueue{
        private final int[] data;
        private final int cap;
        private int head;
        private int size;

        public MyCircularQueue(int k){
            data = new int[k];
            cap = k;
            head = 0;
            size = 0;
        }

        public boolean enQueue(int val){
            if(isFull()){
                return false;
            }
            int tail =  (head + size) % cap;
            data[tail] = val;

            size++;
            return true;
        }

        public boolean deQueue(){
            if(isEmpty()){
                return false;
            }

            head = (head + 1) % cap;
            size--;
            return true;
        }

        public int Front(){
            return isEmpty() ? -1 : data[head];
        }

        public int Rear(){
            if(isEmpty()){
                return -1;
            }
            int tail = (head+size-1)%cap;
            return data[tail];
        }

        public boolean isEmpty(){
            return size==0;
        }

        public boolean isFull(){
            return size == cap;
        }
    }
    public static void main(String[] args) {
        // design circular queue //
    }
}
