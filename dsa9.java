public class dsa9 {

    public static class MinHeap{
        private static int[] heap;
        private static int size;
        private static int capacity;

        public MinHeap(int capacity){
            this.capacity = capacity;
            this.size = 0;
            heap = new int[capacity];
        }

        // helper function //

        private static int parent(int i) { return (i-1)/2;}
        private static int leftChild(int i){ return 2*i+1;}
        private static int rightChild(int i){ return 2*i+2;}
        private static boolean isLeaf(int i){return i>= size / 2 && i < size;}


        public static void insert(int e){
            if(size == capacity){
                throw new IllegalStateException("Heap is full");
            }

            heap[size] = e;
            int curr = size;
            size++;

            while(heap[curr] < heap[parent(curr)]){
               swap(curr,parent(curr));
               curr = parent(curr);
            }

        }

        public int removeMin(){
            if(size == 0){
                throw new IllegalStateException("Heap is empty");
            }

            int min = heap[0];
            heap[0] = heap[--size];
            heapify(0);
            
            return min;
        }

        private static void heapify(int i){
            if(isLeaf(i)) return;

            int left = leftChild(i);
            int right = rightChild(i);

            int smallest = i;

            if(left < size && heap[left] < heap[i]){
                smallest = left;
            }
            if(right < size && heap[right] < heap[smallest]){
                smallest = right;
            }

            if(smallest !=i){
                swap(i,smallest);
                heapify(smallest);
            }
        }

        private static void swap(int i,int j){
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }
    }
    public static void main(String[] args) {
        
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(6);
        minHeap.insert(8);
        minHeap.insert(9);
        minHeap.insert(32);
        minHeap.insert(23);

        System.out.println("the min value of heap: "+minHeap.removeMin());

    }
}
