package com.queue;

public class Block
{
	private int data;
	
	public Block(int data)
	{
		this.data=data;
	}

	public int getData() 
	{
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}
	
	public String toString()
	{
		return String.valueOf(data);
	}
}
