import java.util.*;

 public class WordPairsList
 {
     private ArrayList<WordPair> allPairs;

     public WordPairsList(String[] words)
     {
         // WRITE YOUR CODE HERE
         // initialize allPairs to an empty ArrayList of WordPair objects

         // nested loops through the words array to add each pair to allPairs


     }

     public int numMatches()
     {
         //Write the code for the second part described below
         return 0;
     }

     public String toString() {
         return allPairs.toString();
     }


     public static void main(String[] args)
     {
         String[] words = {"Hi", "there", "Tyler", "Sam"};
         WordPairsList list = new WordPairsList(words);
         System.out.println(list);
         // For second part below, uncomment this test:
         //System.out.println("The number of matched pairs is: " + list.numMatches());
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
 
