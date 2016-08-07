package Aula05;

public class IntArrayList implements List<Integer> {
	
	private Integer[] array = new Integer[5];
	private int size = 0;

	@Override
	public void add(Integer obj) {
		if(size == array.length)
			resize();
		array[++size] = obj;
	}
	
	public Integer get(int index) {
		return array[index];
	}
	
	public void remove(int index) {
		array[index] = null;
		size--;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	public void resize() {
		Integer[] newArray = new Integer[array.length*2];
		int i = 0;
		for(Integer x: array)
			newArray[i++] = x;
		array = newArray;
	}

}
