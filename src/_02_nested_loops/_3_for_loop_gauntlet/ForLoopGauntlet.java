package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for(int i = 1; i<101; i++) {
			System.out.println(i);
		}
		for(int j = 100;j>0;j--) {
			System.out.println(j);
		}
		for(int k = 1; k<101;k++) {
			if(k % 2 == 0) {
				System.out.println(k);
			}
		}
		for(int t = 1; t<101;t++) {
			if (t % 2 == 1) {
				System.out.println(t);
			}
		}
		for (int q = 1 ;q < 501; q++) {
			if (q % 2 == 0) {
				System.out.println(q + " is even.");
			}
			else {
				System.out.println(q + " is odd.");
			}
		}
		for (int w = 0; w<778;w+=7) {
			System.out.println(w);
		}
		for (int y = 0, b = 2011;y<12;y++) {
			System.out.println("in " + (b+y) + ",I was " + y + " years old.");
		}
		for(int m = 0; m< 3; m++) {
			for(int r = 0; r<3; r++) {
				System.out.println(m + " " + r);
			}
		}
		for(int s = 0;s<3;s++) {
			for(int u = 1; u<3; u++) {
				System.out.print(u + s*3);
			}
			//System.out.println((1 + (s*3)) + " " + (2 + (s*3)) + " " + (3 + (s*3)));
		}
	}
}
