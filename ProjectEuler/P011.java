package ProjectEuler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P011 {
	public static final int GRID_WIDTH_HEIGHT = 20;
	
	public static int greatestGridProduct(int grid[][]) {
		int max = 0;
		int gH = greatestHorizontalProduct(grid);
		int gV = greatestVerticalProduct(grid);
		int gD = greatestDiagonalProduct(grid);
		int gOD = greatestOtherDiagonalProduct(grid);
		
		if(gH > max)
			max = gH;
		if(gV > max)
			max = gV;
		if(gD > max) 
			max = gD;
		if(gOD > max)
			max = gOD;
		
		return max;
	}
	
	public static int greatestDiagonalProduct(int grid[][]) {
		int max = 0;
		for(int i = 0 ; i <= GRID_WIDTH_HEIGHT - 4; ++i) {
			for(int j = 0; j <= GRID_WIDTH_HEIGHT - 4; ++j) {
				int product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
				if(product > max) {
					max = product;
				}
			}
		}
		return max;
	}
	
	public static int greatestOtherDiagonalProduct(int grid[][]) {
		int max = 0;
		for(int i = 0 ; i <= GRID_WIDTH_HEIGHT - 4; ++i) {
			for(int j = 3; j < GRID_WIDTH_HEIGHT; ++j) {
				int product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
				if(product > max) {
					max = product;
				}
			}
		}
		return max;
	}
	
	public static int greatestHorizontalProduct(int grid[][]) {
		int max = 0;
		for(int i = 0 ; i < GRID_WIDTH_HEIGHT; ++i) {
			for(int j = 0; j <= GRID_WIDTH_HEIGHT - 4; ++j) {
				int product = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
				if(product > max) {
					max = product;
				}
			}
		}
		return max;
	}
	
	public static int greatestVerticalProduct(int grid[][]) {
		int max = 0;
		for(int i = 0 ; i < GRID_WIDTH_HEIGHT; ++i) {
			for(int j = 0; j <= GRID_WIDTH_HEIGHT - 4; ++j) {
				int product = grid[j][i] * grid[j+1][i] * grid[j+2][i] * grid[j+3][i];
				if(product > max) {
					max = product;
				}
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		BufferedReader in = null; 
		int grid[][] = new int[20][20];
		int row = 0;
		try {
			in = new BufferedReader(new FileReader("C:\\Users\\johnny\\workspace\\AlgorithmJava\\src\\ProjectEuler\\P011.txt")); 
			while(in.ready()) {
				String getline = in.readLine(); 
				StringTokenizer tokenizer = new StringTokenizer(getline, " ");
				int pos = 0;
				while(tokenizer.hasMoreTokens()) {
					grid[row][pos++] = Integer.parseInt(tokenizer.nextToken());
				}
				++row;
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	
		System.out.println(greatestGridProduct(grid));

	}

}
