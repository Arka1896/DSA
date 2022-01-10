package SinglyLinkedList;

public class SinglyLinkedList 
{
    private Node head;
    
    public void addToHead(int dataVal)
    {
    	if(head==null)
    	{
    		Node tempNode=new Node(dataVal,null);
    		head=tempNode;
    	}
    	else
    	{
    		Node tempNode=new Node(dataVal,head);
    		head=tempNode;
    	}
    }
    public void addToNode(int dataVal)
    {
    	Node tempNode=new Node(dataVal,null);
    	if(head==null)
    	{ 
    		addToHead(dataVal);
    	}
    	else
    	{
    		Node tempHead=head;
    		while(tempHead.getNext()!=null) 
    		{
    			tempHead=tempHead.getNext();
    		}
    		tempHead.setNext(tempNode);
    		
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
    		int currIndex=0;
    		while(tempHead.getNext()!=null && index!=1)
    		{
    			tempHead=tempHead.getNext();
    			currIndex++;
    			if(currIndex==(index-1))
    			{
    				break;
    			}
    		}
    		Node tempNode=new Node(dataVal,null);
    		tempNode.setNext(tempHead.getNext());
    		tempHead.setNext(tempNode);
    		
    			
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
    			System.out.println("Index Out of Bound");
    		}
    		else
    		{
    			tempHead.setDataval(dataVal);
    		}
    		
    	}
    }
    public void deleteHead()
    { 
    	head=head.getNext();
    }
    public void deleteAtIndex(int index)
    {
    	if(index==0) 
    	{
    		deleteHead();
    	}
    	else
    	{
    		Node tempHead=head;
    		int currIndex=0;
    		while(tempHead.getNext()!=null && index!=1)
    		{
    			tempHead=tempHead.getNext();
    			currIndex++;
    			if(currIndex==index-1)
    			{
    				break;
    			}
    		}
    		if(index>currIndex+1)
    		{
    			System.out.println("Index Out of Bound");
    		}
    		else
    		{
    			tempHead.setNext(tempHead.getNext().getNext());
    		}
    		
    		
    	}
    }
    public void printAllNodeValues()
    {
    	String allVals="";
    	Node tempHead=head;
    	while(tempHead.getNext()!=null)
    	{
    		allVals+=tempHead.getDataVal()+"->";
    		tempHead=tempHead.getNext();
    	}
    	allVals+=tempHead.getDataVal();
    	System.out.println(allVals);
    }
    
}
