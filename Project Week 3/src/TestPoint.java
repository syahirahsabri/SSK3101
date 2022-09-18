
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testValue = 15;
		int Z = 10;
		Point pt = new Point(0, 0);
		System.out.println("X:" + pt.x + " Y: " + pt.y);
		System.out.println("Test Value :" + testValue);
		test(pt, testValue);
		System.out.println("X:" + pt.x + " Y: " + pt.y);
		System.out.println("Test Value :" + testValue);
		System.out.println("Z : " + Z);
		}
		public static void test(Point p, int num) {
		p.x = 150;
		p.y = 200;
		num = num + 4;
		p.setZ(num);
		}
		}
		class Point {
		public int x;
		public int y;
		private int z;
		public Point(int xValue, int yValue) {
		x = xValue;
		y = yValue;
		this.z = 5;
		}
		public void setZ(int zValue) {
		this.z = zValue;
		}
		

	}


