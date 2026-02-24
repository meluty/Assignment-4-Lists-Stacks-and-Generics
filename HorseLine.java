public class HorseLine implements List {

	private Horse[] array;
	private int numElements;
	
	public HorseLine(int size) {
		this.array = new Horse[size];
		this.numElements = 0;
	}
	
	public HorseLine(Horse[] array) {
		if (array == null) {
			this.array = new Horse[0];
		} else {
			this.array = array;
		}
		numElements = array.length;
	}
	
	public void expandAndCopy() {
		Horse[] newStorage = new Horse[array.length*2+1];
		for (int i = 0; i < array.length; i++) {
			newStorage[i] = array[i];
		}
		this.array = newStorage;
	}
	
	public void add(Horse h) {
		while (numElements >= array.length) {
			expandAndCopy();
		}
		array[numElements++] = h;
	}
		
	public int size() {
		return this.numElements;
	}
			
	public int find(Horse h) {
		int index = -1;
		int i = 0;
		while (i < array.length && index == -1) {
			if (array[i].equals(h)) {
				index = i;
			}
			i++;
		}
		return index;
	}
			
	public Horse get(int index) {
		return array[index];
	}
	
}