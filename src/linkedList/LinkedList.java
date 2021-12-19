package linkedList;

import linkedList.LinkedList.Node;

class LinkedList<E>{
	
	public Node<E> head;
	public Node<E> prev = null;
	
	public  Node<E> addFirst(E data){
		Node<E> node = new Node<E>(data);
		if(head == null) {
			return head = node;
		}
		Node<E> temp = head;
		node.next = head;
		head = node;
		
		return head;
	}
	public  Node<E> addLast(E data){
		Node<E> node = new Node<E>(data);
		if(head == null) {
			return head = node;
		}
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
		
		return head;
	}
	public  Node<E> deleteFirst(){
		if(head == null) {
			return null;
		}
		Node<E> temp = head.next;
		head = temp;
		
		return head;
	}
	
	public  Node<E> deleteLast(){
		
		if(head == null) {
			return head  = null;
		}
		Node<E> temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	public int count() {
		int count = 0;
		Node<E> temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public Node<E> reverse(){
		if(head == null) {
			return head;
		}
		Node<E> prev = null;
		Node<E> curr = head;
		Node<E> Next = null;
		while(curr!=null) {
			Next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = Next;
		}
		head = prev;
		return head;
	}
	public Node<E> recReverse(Node<E> head){
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			head.next = prev;
			return head;
		}  

		Node<E> recReverse = recReverse(head.next);
		head.next.next = head;
		head.next = null;
		
		return recReverse;
	}
	
	public void print() {
		Node<E> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	class Node<E> {
		public E data;
		public Node<E> next;

		public Node(E data) {

			this.data = data;
			next = null;
			
		}
	}
	
}
