package CollectionFramework;

import java.util.*;

public class LinkedListCode {
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	// Add first
	public void addFirst(int data) {
		if(head == null) {
			Node newNode = new Node(data);
			head = tail = newNode;
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	//add in the middle
	public void addMiddle(int idx, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		int i = 0;
		if(i == 0) {
			addFirst(data);
		}
		while(i < idx-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		LinkedListCode ll = new LinkedListCode();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(4);
		ll.addMiddle(2, 3);
		
		ll.print();
	}
}