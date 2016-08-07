package Aula03;

import java.util.Scanner;

class Node {
	char myChar;
	Node next;
	
	public Node(char ch) {
		this.myChar = ch;
	}
	
	@Override
	public String toString() {
		return String.valueOf(myChar);
	}
}

public class LinkedList  {
	private Node head;
	
	public void add(char c) {
		Node node = new Node(c);
		if(head == null)
			head = node;
		else {
			Node n = head;;
			while(n.next != null)
				n = n.next;
			n.next = node;
		}
	}
	
	public int size() {
		Node current = head;
		int x = 1;
		
		while(current.next != null) {
			x++;
			current = current.next;
		}
		return x; 
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		String stg = sc.nextLine();
		
		for(int i = 0; i < stg.length(); i++) {
			list.add(stg.charAt(i));
		}
		
		System.out.println(list.size());
		list.printMiddle();
		
		
	}

}
