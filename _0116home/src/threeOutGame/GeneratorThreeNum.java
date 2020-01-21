package threeOutGame;

import java.util.Random;

public class GeneratorThreeNum { // 난수 3개 생성 클래스
	private Random rd = new Random();
	
	public void makeRandom(int[] baseball) {
		int b1, b2, b3;
		b1 = rd.nextInt(10);
		while(true) {
			b2 = rd.nextInt(10);
			if(b1 != b2)
				break;
		}
		while(true) {
			b3 = rd.nextInt(10);
			if(b3 != b1 && b3 != b2)
				break;
		}
		baseball[0] = b1;
		baseball[1] = b2;
		baseball[2] = b3;
	}
}
