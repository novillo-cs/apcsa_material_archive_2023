import java.util.ArrayList;

public class WordPairTest {
     public static void main(String[] args)
     {
         // Create an ArrayList of WordPair objects called pairs


         pairs.add(new WordPair("hi","there"));
         pairs.add(new WordPair("hi","bye"));
         System.out.println(pairs);
     }
 }

 class WordPair {
     private String word1;
     private String word2;

     public WordPair(String w1, String w2) {
         word1 = w1;
         word2 = w2;
     }
     public String getFirst() {
         return word1;
     }
     public String getSecond() {
         return word2;
     }
     public String toString() {
         return "(" + word1 + ", " + word2 + ")";
     }
 }
 
