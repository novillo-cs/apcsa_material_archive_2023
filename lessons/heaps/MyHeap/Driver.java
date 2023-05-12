public class Driver{

    public static void main(String[] arg)
    {
      	// This is a max heap
        MyHeap heap = new MyHeap(14);
        heap.insert(10);
        heap.insert(7);
        heap.insert(26);
        heap.insert(8);
        heap.insert(1);
        heap.insert(20);
        heap.insert(15);

        heap.print();
        System.out.println("The deleted value is " + heap.deleteRoot());
        heap.print();
    }
}
