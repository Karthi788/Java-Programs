

class Vehicle{
    public void drive(){
        System.out.println("Ford Mustang");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Repairing car");
    }
}

public class Inheritance
{
	public static void main(String[] args) {
		
		Car car = new Car();
		car.drive();
		Vehicle vehicle = new Vehicle();
		vehicle.drive();

	}
}