import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
	public static void main(String [] args) {
        try{
    		Scanner sc = new Scanner(new File("2d.txt"));
    		
    		int rows = 0;
    		int cols = 0;
    		int cols_tmp = 0;
    		while (sc.hasNextLine()){
    			rows += 1;
    			cols_tmp = 0;
    			String line = sc.nextLine();
    			Scanner line_scanner = new Scanner(line);
    			while (line_scanner.hasNext()) {
    				cols_tmp += 1;
    				line_scanner.next();
    			}
    			if (cols_tmp > cols) {
    				cols = cols_tmp;
    			}
    		}
    		sc = new Scanner(new File("2d.txt"));
    		
    		int[][]array = new int[rows][cols];
    		int row_array = 0;
    		int col_array = 0;
    		System.out.println("rows " + rows + " " + cols);
    		while (sc.hasNextLine()){
    			String line = sc.nextLine();
    			Scanner line_scanner = new Scanner(line);
    			col_array = 0;
    			while (line_scanner.hasNext()) {
    				System.out.println("new rows " + row_array + " " + col_array);
    				array[row_array][col_array] = Integer.parseInt(line_scanner.next());
    				col_array += 1;
    			}
    			row_array += 1;
    		}
    		for (int i = 0; i<rows; i++) {
    			for (int j = 0; j<cols; j++) {
    				System.out.print(array[i][j] + " ");
    			}
    			System.out.println();
    		}
        } catch (FileNotFoundException ex) {
            System.out.println("File has not been found.");
        }
	}
}
