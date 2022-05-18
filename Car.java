class Car{
	private int year;
	private String make;
	private double speed;
	
	Car(int year,String make,double beg_speed){
		this.year=year;
		this.make=make;
		this.speed=beg_speed;
	}
	
	public int getYear(){
		return  this.year;
	}
	
	public String getMake(){
		return  this.make;
	}
	
	public double getSpeed(){
		return  this.speed;
	}
	
	public void Accelerate(){
		this.speed++;
	}
}