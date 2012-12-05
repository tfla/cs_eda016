import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.ptdc.window.SimpleWindow;

public class AnimatedSquare {
	public static void main(String[] args) {
		System.out.println("Skriv förminskning och rotationsvinkel.");
		Scanner scan = new Scanner(System.in);
		int dim = scan.nextInt();
		int rot = scan.nextInt();
		boolean grow = false;
		SimpleWindow w = new SimpleWindow(600, 600, "DrawManySquares");
		Square sq = new Square(300, 300, 200);
		while (true) {
			if (!grow){
				sq.draw(w);
				sq.setSide(sq.getSide() - dim);
				try {
					sq.rotate(rot);
					Thread.currentThread();
					Thread.sleep(100);
				} 
				catch(InterruptedException e){
					System.out.println(e);
				}
				w.clear();
				if (sq.getSide() < dim){
					grow = true;
				}
			}
			else {
				sq.draw(w);
				sq.setSide(sq.getSide() + dim);
				try {
					sq.rotate(rot);
					Thread.currentThread();
					Thread.sleep(100);
				} 
				catch(InterruptedException e){
					System.out.println(e);
				}
				w.clear();
				if (sq.getSide() > 200){
					grow = false;
				}
			}
		}
	}
}
