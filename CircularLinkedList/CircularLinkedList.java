package CircularLinkedList;

public class CircularLinkedList 
{
   private Node head;
   
   public void addToHead(int dataVal)
   {
	   if(head==null)
	   {
		  Node tempNode=new Node(dataVal,null);
		  head=tempNode;
		  head.setNext(head);
	   }
	   else
	   { 
		   Node tailRef=head;
		   while(tailRef.getNext()!=head)
		   {
			   tailRef=tailRef.getNext();
		   }
		   Node tempNode=new Node(dataVal,head);
		   tailRef.setNext(tempNode);
		   head=tempNode;
	   }
   }
   public void addToIndex(int dataVal,int index)
   {
	   if(index==0)
	   {
		   addToHead(dataVal);
	   }
	   else
	   {
	       Node tailRef=head;
	       int currIndex=0;
	       while(tailRef.getNext()!=head && index!=1)
	       {
		     tailRef=tailRef.getNext();
		     currIndex++;
		     if(currIndex==index-1)
		     {
			   break;
		     }
	        }
	      Node tempNode=new Node(dataVal,tailRef.getNext());
	      tailRef.setNext(tempNode);
	   } 
   }
   public void updateAtIndex(int dataVal,int index)
   {
	   if(index==0)
	   {
		   head.setDataval(dataVal);
	   }
	   else
	   {
		  Node tailRef=head;
		  while(tailRef.getNext()!=head) 
		  {
			  tailRef=tailRef.getNext();
			  index--;
			  if(index==0)
			  {
				break;  
			  }
		  }
		  if(index>0)
		  {
			  System.out.println("Index Out Of Bound");
		  }
		  else
		  {
			  tailRef.setDataval(dataVal);
		  }
	   }
   }
   public void deleteAtHead()
   {
	   if(head==null)
	   {
		   System.out.println("Nothing to delete");
	   }
	   else
	   {
		   Node tailRef=head;
		   while(tailRef.getNext()!=head)
		   {
			   tailRef=tailRef.getNext();
		   }
		   tailRef.setNext(head.getNext());
		   head=head.getNext();
	   }
	   
   }
   public void deleteAtIndex(int index)
   {
	   if(index==0)
	   {
		   deleteAtHead();
	   }
	   else
	   {
		   Node tailRef=head;
		   int currIndex=0;
		   while(tailRef.getNext()!=head && index!=1)
		   {
			   tailRef=tailRef.getNext();
			   currIndex++;
			   if(currIndex==index-1)
			   {
				   break;
			   }
		   }
		   //without the index handling
		   tailRef.setNext(tailRef.getNext().getNext());
	   }
		   
   }
   public void printAllValues()
   {
	   String varAllVals="";
	   Node tempHead=head;
	   while(tempHead.getNext()!=head)
	   {
		   varAllVals+=tempHead.getDataVal()+"->";
		   tempHead=tempHead.getNext();
	   }
	   varAllVals+=tempHead.getDataVal();
	   System.out.println(varAllVals);
   }
}
