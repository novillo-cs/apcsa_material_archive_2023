public class MyHeap {
        private int[] Heap;
        private int size;
        private int maxsize;

        public MyHeap(int numElements) {
            maxsize = numElements;
            size = 0;
            Heap = new int[maxsize + 1];
        }

        private int parent(int pos) {
            // RETURN POSTION PARENT
            return (pos-1)/2;
        }

        private int leftChild(int pos) {
            // RETURN POSITION LEFTCHILD
            return 2*pos + 1;
        }

        private int rightChild(int pos) {
            // RETURN POSITION LEFTCHILD
            return 2*pos + 2;
        }


        private void swap(int idx1, int idx2) {
            // YOUR CODE HERE
            int temp = Heap[idx1];
            Heap[idx1] = Heap[idx2];
            Heap[idx2] = temp;
        }

        private void downHeapify(int pos) {
            if (pos >= (size / 2) && pos <= size)
                return;
                
            if (Heap[pos] < Heap[leftChild(pos)]) {
                swap(pos, leftChild(pos));
                downHeapify(leftChild(pos));
                    }
            else if(Heap[pos] < Heap[rightChild(pos)]) {
                swap(pos, rightChild(pos));
                downHeapify(rightChild(pos));
                    }
        }
        
        private void heapifyUp(int pos) {
            int temp = Heap[pos];
            while(pos>0 && temp > Heap[parent(pos)]){
                // YOUR CODE HERE
            }
            Heap[pos] = temp;
        }


        public void insert(int element) {
            // YOUR CODE HERE
            
        }

        public void print() {
            // YOUR CODE HERE
        }

        public int deleteRoot() {
           // YOUR CODE HERE
            return 0;
        }

}
