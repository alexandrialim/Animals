abstract public class Animal {
	protected int legs;
	public Animal(int l) {
		this.legs = l;
	}
	public String walk() {
		return "This Animal walks with " + legs + " legs";
	}
	abstract protected String eat();
}
