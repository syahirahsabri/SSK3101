

		public class Animal {
			public static void main(String[] args) {
			m(new Kitten());
			m(new Cat());
			}
			public static void m(Object x) {
			System.out.println(x.toString());
			}
			}
			class Kitten extends Cat {
			public Kitten() {
			System.out.println("Kitten Constructor");
			}
			}
			class Cat extends Object {
			public Cat() {
			this("Cat Constructor");
			}
			public Cat(String s) {
			System.out.println(s);
			}
			public String toString() {
			return "String statement";
			}
			}
		


