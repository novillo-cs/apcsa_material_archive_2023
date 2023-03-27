### Directions to implement your arrayDeque

- You must implement a generic arrayDeque
- The arrayDeque size is the number of elements in the structure
- The arrayDeque capacity is the number of elements your arrayDeque can hold before
resize the array
- All methods should have a complexity of 0(1), except the toString()
- If your have this arrayDeque ["hello", "my", "dear", "friends!"], the left element (hello) is the start, while the right element (friends!) is the end.
- Resize the array when you try to add an element to any side side and the array is at capacity. The resize method should double the capacity of the deque and copy the values in the deque over in the correct order.
- Throw an exception NoSuchElementException in methods remove and get methods in deque is empty.
- Throw an exception NullPointerException in methods add if the element you are trying to add is null.

In your Driver, you must create the objects like this:

```
    MyDeque<Integer> deque = new MyDeque<Integer>(10);
    MyDeque<String> deque = new MyDeque<String>(10);
```


```
    public class MyDeque<E>{
      // Instance variables
      private E[] data;
      private int size;
      private int start, end;

      // Constructors
      public MyDeque(){ 
        data = (E[])new Object[ENTER_CAPACITY_HERE];
        size = 0;
        start = 0;
        end = 0;
      }
  
      public MyDeque(int initialCapacity){ 
         data = (E[])new Object[ENTER_CAPACITY_HERE];
         size = 0;
         start = 0;
         end = 0;
      }
      
      // Add a new value on the indicated side
      public void addFirst(E element){ }
      public void addLast(E element){ }
      
      // Remove and return the element
      public E removeFirst(){ }
      public E removeLast(){ }
      
      // Return the element. Do not deleter elements.
      public E getFirst(){ }
      public E getLast(){ }
      
      // Return deque size
      public int size(){ }
      
      // Getters
  
      // Return data
      public E[] getData(){ }
      // Return start
      public int getStart(){ }
      // Return end
      public int getEnd(){ }
      
      // Resize the array. Double its length (data.length * 2)
      private void resize() {}
      
      // Return the deque as string. Ex.:  "[hello, my, dear, friends!]"
      public String toString(){ }
    }
```

Using a generic array requires that you create an array of Object, and then cast it to E. This causes a warning. Please use the following code to avoid that issue:
```
    public class MyDeque(){
      @SuppressWarnings("unchecked")
    }
```

  
