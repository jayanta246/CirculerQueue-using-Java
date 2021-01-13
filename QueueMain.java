
package com.queue;

public class QueueMain 
{

	public static void main(String[] args)
	{
		Queue queue=new Queue(3);
		queue.endQueue(10);
		queue.endQueue(20);
		queue.endQueue(30);
		queue.deQueue();
		queue.endQueue(40);
		queue.print();
	}

}
