**1. Bunny Ears**


We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


bunnyEars(0) → 0  
bunnyEars(1) → 2  
bunnyEars(2) → 4  

```
public int bunnyEars(int bunnies) {
  
}
```

**2. Triangle**

We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.


triangle(0) → 0  
triangle(1) → 1  
triangle(2) → 3  

```
public int triangle(int rows) {
  
}
```

**3. strCopies**

Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.


strCopies("catcowcat", "cat", 2) → true  
strCopies("catcowcat", "cow", 2) → false  
strCopies("catcowcat", "cow", 1) → true  

```
public boolean strCopies(String str, String sub, int n) {
  
}
```

**4. array11 **

Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


array11([1, 2, 11], 0) → 1  
array11([11, 11], 0) → 2  
array11([1, 2, 3, 4], 0) → 0  

```
public int array11(int[] nums, int index) {
  
}
```

**5. countPairs  **

We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.


countPairs("axa") → 1  
countPairs("axax") → 2  
countPairs("axbx") → 1  

```
public int countPairs(String str) {
  
}

```

**6. groupSum  **

Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem, you can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array, our convention is to consider the part of the array starting at index start and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.

groupSum(0, [2, 4, 8], 10) → true
groupSum(0, [2, 4, 8], 14) → true
groupSum(0, [2, 4, 8], 9) → false


```
public boolean groupSum(int start, int[] nums, int target) {
  
}
```
