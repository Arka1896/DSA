package DoublyLinkedList;

public class Main 
{
   public static void main(String[] args) 
   {
	   DoublyLinkedList dLL=new DoublyLinkedList();
	   dLL.addToHead(30);
	   dLL.addToHead(20);
	   dLL.addToHead(10);
	   dLL.add(40);
	   dLL.add(50);
	   //dLL.addAtIndex(999, 0);
	   //dLL.getDataValAtIndex(5);
	   //dLL.updateAtIndex(999, 2);
	   dLL.deleteAtHead();
	   dLL.deleteAtHead();
	   dLL.printAllNodes();
	
   }
   
}
