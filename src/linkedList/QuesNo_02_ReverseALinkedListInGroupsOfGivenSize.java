package linkedList;

public class QuesNo_02_ReverseALinkedListInGroupsOfGivenSize {

	public static void main(String[] args) {
		
		LinkedList e = new LinkedList();
		
		e.addFirst(5);
		e.addFirst(4);
		e.addFirst(3);
		e.addFirst(2);
		e.addFirst(1);
		
		e.addLast(6);
		e.addLast(7);
		e.addLast(8);
		e.addLast(9);
		
		e.recReverse(e.head);
		e.print();

	}

}
