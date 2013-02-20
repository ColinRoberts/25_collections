class Tester {
	public static void main(String[] args) {
		Caturpilar c = new Caturpilar(2);
		c.add(5);
		System.out.println(c.toString());
		c.add(23);
		System.out.println(c.toString());
		c.add(12);
		System.out.println(c.toString());
		c.add(3);
		System.out.println(c.toString());
		System.out.println(c.get(2));
		c.set(2, 3);
		System.out.println(c.toString());
		c.remove(0);
		System.out.println(c.toString());
		c.remove(1);
		System.out.println(c.toString());
		c.add(12);
		c.add(3);
		System.out.println(c.toString());
		c.set(2, 3);
		System.out.println(c.toString());
	}
}