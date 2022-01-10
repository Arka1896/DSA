package SinglyLinkedList;

public class Main 
{
   public static void main(String[] args) 
   {
	  SinglyLinkedList sLL=new SinglyLinkedList();
	  sLL.addToHead(10);
	  sLL.addToHead(20);
	  sLL.addToHead(50);
	  sLL.addToNode(80);
	  sLL.addToNode(90);
	  //sLL.addAtIndex(100, 1);
	  //sLL.updateAtIndex(999, 4);
	  sLL.deleteAtIndex(4);
	  sLL.printAllNodeValues();
   }
}
