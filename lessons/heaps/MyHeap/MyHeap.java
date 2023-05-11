public class MyHeap {

    private int[] heap;
    private int size;

    public MyHeap(int capacity) {
        // Initialize heap
    }

    public void insert(int value) {
	// Insert value into heap
    }

    public int peek() {
        // Return root
        return 0;
    }

    public int delete(int index) {
	// Delete from heap
	// Return deleted value
	return 0;

    }

    private void fixHeapAbove(int index) {
    	// Fix level above
    	// Compare newValue with heap[getParent(index)]
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
    	// Fix level below
    	
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            
            // Your code here
        }
    }

    public void printHeap() {
        // Print your heap
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        // return parent index
	return 0;
    }

    public boolean isEmpty() {
	// Your code here
        return True;
    }

    public int getChild(int index, boolean left) {
        // Return the index of the child (left or right based on parameter)
	return 0;
    }

}
