package SinglyLinkedList;

public class Node 
{
  private int dataVal;
  private Node next;
  public  Node()
  {
	  this.dataVal=0;
	  this.next=null;
  }
  public  Node(int dataVal,Node next)
  {
	  this.dataVal=dataVal;
	  this.next=next;
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
  
}
