import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Building b1 = new Building(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(b1.length);
		System.out.println(b1.width);
		System.out.println(b1.height);
	}

}
class Building{
	int length;
	int width;
	int height;
	public Building(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
}
