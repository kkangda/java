package threeOutGame;

public class BaseBallMain { // ����Ŭ����
	public static int[] ball = new int[3];

	public static void main(String[] args) {
		while (true) {
			BaseBallMenu menu = new BaseBallMenu();
			GeneratorThreeNum gene = new GeneratorThreeNum();
			
			gene.makeRandom(ball);
			for (int i : ball) {
				System.out.print(i+" ");
			}
			System.out.println();
			menu.menu(ball);
		}
	}
}
