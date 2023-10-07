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
		for(int p = 0; p<3; p++) {
			System.out.println();
			for (int a = 1; a<4; a++) {
				System.out.print(a + p*3);
			}
		}
		for(int v = 0; v<10; v++) {
			System.out.println();
			System.out.println();
			System.out.println();
			for(int b = 1; b<11; b++) {
				System.out.print(b + v * 10 + "  ");
			}
		}
		String u = "*";
		for ( int y = 0; y<6; y++) {
			System.out.println();
			for (int x = 0; x<6; x++) {
				System.out.print(u);
			}
		}
	}

}

