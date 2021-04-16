import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static int contA = 0;
	private static int contB = 0;
	private static int contC = 0;
	static BufferedReader br;
	static BufferedWriter bw;
	
	private static void towersCont(int A, int C) {
		if(A == 1 && C == 2) {
	    	contA--;
	    	contB++;
	    }
	    else if(A == 1 && C == 3) {
	    	contA--;
	    	contC++;
	    }
	    else if(A == 2 && C == 1) {
	    	contB--;
	    	contA++;
	    }
	    else if(A == 2 && C == 3) {
	    	contB--;
	    	contC++;
	    }
	    else if(A == 3 && C == 1) {
	    	contC--;
	    	contA++;
	    }
	    else if(A == 3 && C == 2) {
	    	contC--;
	    	contB++;
	    }
	}
	
	public static void Hanoi(int n, int A,  int B, int C) throws IOException {
		if(n > 0) {
		    Hanoi(n-1, A, C, B);
		    towersCont(A, C);
		    bw.write(Integer.toString(contA) + " " + Integer.toString(contB) + " " + Integer.toString(contC) + "\n");
		    Hanoi(n-1, B, A, C);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new FileReader("data/Hanoi_input.txt"));
		bw = new BufferedWriter(new FileWriter("data/Hanoi_output.txt"));
		
		int m = Integer.parseInt(br.readLine());
		for(int i = 0; i<m; i++) {
			int nDisks = Integer.parseInt(br.readLine());
			contA = nDisks;
			contB = 0;
			contC = 0;
			bw.write(Integer.toString(nDisks) + " " + "0" + " " + "0\n");
			Hanoi(nDisks, 1, 2, 3);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
