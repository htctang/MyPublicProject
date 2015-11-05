package javaWork3;

public class Rectangle extends GeometricObject{

	private Double height=1.0;
	private Double weight=1.0;
//	private Rectangle rectangle;
	public Rectangle() {
		
	}
	public Rectangle(Double height,Double weight){
		
		this.height=height;
		this.weight=weight;
		
	
	}
public Rectangle(Double height,Double weight,String color,boolean filled){
		super(color,filled);
		this.height=height;
		this.weight=weight;
		
	
	}
	
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getArea(){
		return height*weight;
	}
	public String toString(){
		return super.toString()+"³¤Îª"+weight+"¿íÎª"+height;
	}
}
