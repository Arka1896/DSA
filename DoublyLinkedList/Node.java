package DoublyLinkedList;

import SinglyLinkedList.Node;

public class Node 
{
	private int dataVal;
	private Node next;
	private Node prev;
	public  Node()
	{
		this.dataVal=0;
		this.next=null;
		this.prev=null;
	}
	public  Node(int dataVal,Node next,Node prev)
	{
		this.dataVal=dataVal;
		this.next=next;
		this.prev=prev;
	}
	public int getDataVal()
	{
	    return this.dataVal;
	}
	public void setDataval(int dataVal)
	{
		this.dataVal=dataVal;
	}
	public Node getNext()
	{
		return this.next;
	}
	public void setNext(Node next)
	{
		this .next=next;
	}
	public Node getPrev()
	{
		return this.prev;
	}
	public void setPrev(Node prev)
	{
		this .prev=prev;
	}
}
