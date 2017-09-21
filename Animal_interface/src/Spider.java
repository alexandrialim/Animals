public class Spider extends Animal {

	protected Spider(int l) {
		super (l);
	}
	public Spider(){
		super(8);
	}
	public String eat(){
		return "Spiders eat bugs.";
	}
}