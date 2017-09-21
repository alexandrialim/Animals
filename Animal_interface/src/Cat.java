public class Cat extends Animal implements Pet  {
	private String name;
	protected Cat(int l, String name) {
		super(l);
		this.name = name;
	}
	
	public Cat(){
		super(4);
		name = "";
	}
	public String getName(){
		return name;
	}
	public String setName(String name){
		return this.name = name;
	}
	public void play(){
		System.out.println("The cat is playing.");
	}
	public String eat(){
		return "Cat's eat cat food.";
	}
}
