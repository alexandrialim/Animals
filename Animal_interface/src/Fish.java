public class Fish extends Animal implements Pet {
	private String name;
	protected Fish(int l, String name) {
		super (l);
		this.name = name;
	}
	public Fish(){
		super(0);
		name = "Piscene";
	}
	public String eat(){
	 return "Fish eat fish food.";
	}
	public int walk(int l){
		System.out.println("Fish can't walk and don't have legs");
		return l = 0;
	}
	public void play(){
		System.out.print("Fish play around by chasing things in the water.");
	}
	
	public String getName(){
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}

}
