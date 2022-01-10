package CircularLinkedList;

public class Main 
{
  public static void main(String[] args) 
  {
	CircularLinkedList cLL=new CircularLinkedList();
	cLL.addToHead(10);
	cLL.addToHead(20);
	cLL.addToHead(30);
	cLL.addToHead(40);
	//cLL.addToIndex(999, 999);
	//cLL.updateAtIndex(999,4);
	//cLL.deleteAtHead();
	cLL.deleteAtIndex(3);
	cLL.printAllValues();
  }
}
