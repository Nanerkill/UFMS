package Aula05;

public interface Queue<E> {
	
	void enqueue(E obj);
	E dequeue();
	E front();
	int size();
	boolean isEmpty();

}
