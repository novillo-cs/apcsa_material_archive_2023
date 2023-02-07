import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord {
     public static void main(String [ ] args) {
              findLongestWords();
         }

     public static String findLongestWords() {

       String longest_word = "";
       String current;
       try{
           Scanner sc = new Scanner(new File("my_text.txt"));
    
           int length = 0;
           int longest_length = 0;
           while (sc.hasNext()) {
              current = sc.next();
              length = getWorldLength(current);
              if (length > longest_length) {
                 longest_word = current;
                 longest_length = length;
              }
    
           }
             System.out.println("\n"+longest_word+"\n");
       } catch (FileNotFoundException ex) {
            System.out.println("File has not been found.");
       }
       return longest_word;
    }
    
    public static int getWorldLength(String string) {
        int length = 0;
    	for (char c : string.toCharArray()) {
	    	if (Character.isLetter(c)) {
                length += 1;
	    	}
    	}
    	return length;
    }
}
