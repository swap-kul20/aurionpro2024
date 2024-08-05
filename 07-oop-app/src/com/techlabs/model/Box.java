package com.techlabs.model;

public class Box {
	
	private int width;
	private int height;
	private int depth;
	
	public Box()
	{
		this.width=10;
		this.depth=10;
		this.height=10;
	}
	
	public Box(int width,int depth,int height)
	{
		this(width,height);
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	
	public Box(int width, int height)
	{
		this();
		this.width=width;
		this.height=height;
		
	}
	
    public void setWidth(int width)
    {
    	this.width=width;
    }
    
    public int getWidth()
    {
    	return this.width;
    }
    
    public void setHeight(int height)
    {
    	this.height=height;
    }
    
    public int getHeight()
    {
    	return this.height;
    }
    
    public void setDepth(int depth)
    {
    	this.depth=depth;
    }
    
    public int getDepth()
    {
    	return this.depth;
    }

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	
	


}
