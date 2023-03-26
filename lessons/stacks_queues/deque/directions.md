### Directions to implement your arrayDeque

- You must implement a generic arrayDeque
- The arrayDeque size is the number of elements in the structure
- The arrayDeque capacity is the number of elements your arrayDeque can hold before
resize the array
- All methods should have a complexity of 0(1), except the toString()
- If your have this arrayDeque ["hello", "my", "dear", "friends!"], the left element (hello) is the start, while the right element (friends!) is the end.
- Throw an exception NoSuchElementException in methods remove and get methods in deque is empty
- Throw an exception NullPointerException in methods add if the element you are trying to add is null.

Add (both first and last) will throw: NullPointerException - if the specified element is null (this deque does not permit null elements)

```
    public class MyDeque<E>{
      // Instance variables
      private E[] data;
      private int size;
      private int start, end;

      // Constructors
      public MyDeque(){  }
      public MyDeque(int initialCapacity){  }
      
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
      
      // Resize the array
      private resize(){}
      
      // Return the deque as string. Ex.:  "[hello, my, dear, friends!]"
      public String toString(){ }
    }
```

Creating a generic array you need to create an array of Object, and then cast it to E. This causes a warning. The following code should solve the problem:

```
    public class MyDeque(){
      @SuppressWarnings("unchecked")
    }
```
