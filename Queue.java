package com.queue;

public class Queue 
{
	private int front;
	private int rear;
	private int size;
	private int array[];
	
	public Queue(int size)
	{
		this.size=size;
		this.array=new int[size];
		front=-1;
	}
	
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	public boolean isFull()
	{
		return front==(rear+1)%array.length;
	}
	
	public void endQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Full");
		}
		
		rear=(rear+1)%array.length;
		array[rear]=data;
		if(front==-1)
		{
			front=rear;
		}
	}
	
	public int deQueue()
	{
		int current=array[front];
		if(isFull())
		{
			System.out.println("Empty");
		}
		if(front==rear)
		{
			front=-1;
		}
		else
		{
			front=(front+1)%array.length;
		}
		return current;
	}
	
	public void print()
	{
		int current=front;
		if(isEmpty())
		{
			System.out.println("Empty Queue");
		}
		else
		{
			for(int i=0;i<size;i++)
			{
				if(current!=rear)
				{
					System.out.println(array[current]);
					current=(current+1)%size;
				}
				else
				{
					System.out.println(array[rear]);
					break;
				}
			}
		}
	}
}
