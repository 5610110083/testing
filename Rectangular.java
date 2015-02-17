public class Rectangular extends Shape{
	private double width;
	private double height;

	public Rectangular(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public double getArea(){
		return width*height;
	}
}
