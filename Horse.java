public class Horse {
	private String name;
	private int height; // in metres?
	
	public Horse(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public boolean equals(Horse other) {
		return this.name.equals(other.name) && this.height == other.height;
	}
	
	public String toString() {
		return name + " the horse, ("+height+ "m tall)";
	}
}