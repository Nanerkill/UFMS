package Aula04;

public interface List<E> {
	
	void add(E obj);
	boolean add(E obj, int index);
	int size();
	void printMiddle();
	String printAll();
	E get(int index);
	void swap(int index1, int indez2);
	boolean isEmpty();

}
