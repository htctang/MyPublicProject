package javaWork3;

import java.util.Date;



public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dataCreated;
	public GeometricObject() {
		dataCreated = new Date();
	}
	public GeometricObject(String color,boolean filled){
		this();
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDataCreated() {
		return dataCreated;
	}
	public String toString() {
		return "该对象创建的时间为"+dataCreated+"\n颜色为："+color+"\n填充为"+filled;
	}
	
}
