package Aula04;

class Node<E> {
	
	E value;
	Node next;
	
	public Node(E value) {
		this.value = value;
	}
	
	public String toString() {
		return value.toString();
	}
	
}

public class LinkedList<E> implements List<E> {
	Node head;

	@Override
	public void add(E obj) {
		
		Node node = new Node(obj);
		if(head == null)
			head = node;
		else {
			Node aux = head;
			while(aux.next != null)
				aux = aux.next;
			aux.next = node;
		}
	}

	@Override
	public boolean add(E obj, int index) {
		Node node = new Node(obj);
		if(index == 0) {
			node.next = head;
			head = node;
		}
		else {
			Node n = head;
			while(index > 1) {
				n = n.next;
				index--;
			}
			node.next = n.next;
			n.next = node;
		}
		return true;
	}

	@Override
	public int size() {
		int size = 1;
		Node aux = head;
		while(aux.next != null) {
			size++;
			aux = aux.next;
		}
		return size;
	}
	
	public void printMiddle() {
		int size = size();
		if(size%2 == 0) { //par
			int x = size/2;
			Node n = head;
			while(--x > 0)
				n = n.next;
			System.out.println(n + " " + n.next);
		}
		else { //impar
			int x = size/2;
			Node n = head;
			while(x-- != 0)
				n = n.next;
			System.out.println(n);
		}
	}
	
	public String printAll() {
		String print = "";
		
		for(Node n = head; n != null; n = n.next) {
			print += n.value + " ";
		}
		return print;
	}
	
	public E get(int index) {
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return (E)node.value;
	}

	@Override
	public void swap(int index1, int index2) {
		Node n1, n2, a1, a2;
		
		Node n = head;
		
		
	}
	
	@Override
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(4);
		ll.add(3);
		ll.add(7);
		ll.add(1);
		ll.add(9);
		ll.add(8);
		ll.add(6);
		
		System.out.println(ll.printAll());
		System.out.println(ll.size());
		ll.printMiddle();
		
		ll.add(2, 3);
		System.out.println(ll.printAll());
		System.out.println(ll.size());
		ll.printMiddle();
		
		ll.swap(2, 5);
		System.out.println(ll.printAll());
		
		
	}

}
