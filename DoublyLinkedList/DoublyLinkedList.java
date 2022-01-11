package DoublyLinkedList;

public class DoublyLinkedList 
{
    private Node head;
    public void addToHead(int dataVal)
    {
    	if(head==null)
    	{
    		Node tempNode=new Node(dataVal,null,null);
    		head=tempNode;
    	}
    	else
    	{
    		Node tempHead=head;
    		Node tempNode=new Node(dataVal,head,null);
    		head.setPrev(tempNode);
    		head=tempNode;
    	}
    }
    public void add(int dataVal)
    {
 	   if(head==null)
 	   {
 		  addToHead(dataVal);
 	   }
 	   else
 	   {
 		 Node tailNode=head;
 		 while(tailNode.getNext()!=null)
 		 {
 			tailNode=tailNode.getNext();
 		 }
 		 Node tempNode=new Node(dataVal,null,tailNode);
 		 tailNode.setNext(tempNode);
 	   }
    }
    public void addAtIndex(int dataVal,int index)
    {
    	if(index==0)
    	{
    		addToHead(dataVal);
    	}
    	else
    	{
    		Node tempHead=head;
    		int currCount=0;
    		while(tempHead.getNext()!=null && index!=1)
    		{
    			tempHead=tempHead.getNext();
    			currCount++;
    			if(currCount==index-1)
    			{
    				break;
    			}
    		}
    		//Handling Done foe Exception while Index more than Doubly Linked List Size
    		if(index!=1 && index>currCount+1)
    		{
    			System.out.println("Index out of Bound");
    		}
    		else
    		{
    			Node tempNode=new Node(dataVal,tempHead.getNext(),tempHead);
        		tempHead.setNext(tempNode);
        		tempNode.getNext().setPrev(tempNode);//NOT USED IN ADIPTA DA'S CODE
    		}
    		
    	}
    }
    public void getDataValAtIndex(int index)
    {
    	if (index==0)
    	{
    		System.out.println(head.getDataVal());
    	}
    	else
    	{
    		Node tempHead=head;
    		while(tempHead.getNext()!=null)
    		{
    			tempHead=tempHead.getNext();
    			index--;
    			if(index==0)
    			{
    				break;
    			}
    		}
    		if(index>0)
    		{
    			System.out.println("-1");
    		}
    		else
    		{
    			System.out.println(tempHead.getDataVal());
    		}
    		
    		
    	}
    }
    public void updateAtIndex(int dataVal,int index)
    {
    	if(head!=null)
    	{
    		if(index==0)
        	{
        		head.setDataval(dataVal);
        	}
        	else
        	{
        		Node tempHead=head;
        		while(tempHead.getNext()!=null)
        		{
        			tempHead=tempHead.getNext();
        			index--;
        			if(index==0)
        			{
        				break;
        			}
        		}
        		if(index>0)
        		{
        			System.out.println("Index Out of Range");
        		}
        		else
        		{
        			tempHead.setDataval(dataVal);
        		}
        	}
    	}
    	
    }
    public void deleteAtHead()//DIFFERENT FROM ADIPTA Da's CODE
    {
    	if(head!=null)
    	{
    		Node tempNode=head.getNext();
    		tempNode.setPrev(null);
    		head=tempNode;
    	}
    }
    public void printAllNodes()
    {
    	String allDataVals="";
    	Node tempHead=head;
    	if(tempHead==null)
    	{
    		System.out.println("No data to Print");
    	}
    	else
    	{
    		while(tempHead.getNext()!=null)
    		{
    			allDataVals+=tempHead.getDataVal()+"->";
    			tempHead=tempHead.getNext();
    		}
    		allDataVals+=tempHead.getDataVal();
    		System.out.println(allDataVals);
    	}
    }
}
