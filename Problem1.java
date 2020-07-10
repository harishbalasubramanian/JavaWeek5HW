public class Problem1{
	public static void main(String[] args) {
		Lamp l1 = new Lamp(10,5);
		System.out.println(l1.width);
		System.out.println(l1.brightness);
	}
}
class Lamp{
	int brightness;
	int width;
	public Lamp(int brightness, int width) {
		this.brightness = brightness;
		this.width = width;
	}
	public void turnLampOn() {
		System.out.println("Lamp is on");
	}
}
