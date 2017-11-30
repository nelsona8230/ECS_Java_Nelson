//This is the Variables And Names project in which
public class VarAndNames 
{
	public static void main(String[] args)
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		//cars gives the amount of cars available
		cars = 100;
		//spaceinacar gives the amount of space available in the car
		space_in_a_car = 4.0;
		//drivers gives the amount of drivers available
		drivers = 30;
		//passengers gives how many passengers need to be transported
		passengers = 90;
		//carsnotdriven gives the amount of cars without the drivers
		cars_not_driven = cars - drivers;
		//carsdriven is the amount  drivers
		cars_driven = drivers;
		//carpoolcapacity is the amount of drivers multiplied by the amount of space in a car.
		carpool_capacity = cars_driven * space_in_a_car;
		//avgpasspercar is the amount of passengers divided by the amount of cars driven.
		average_passengers_per_car = passengers / cars_driven;
		
		
		System.out.println("There are" + cars +"cars available.");
		System.out.println("There are only" + drivers + "drivers available.");
		System.out.println("There will be" + cars_not_driven + "empty cars today.");
		System.out.println("We can transport" + carpool_capacity + "people today.");
		System.out.println("We have" + passengers + "to carpool today." );
		System.out.println("We need to put about" + average_passengers_per_car + "in each car" );

	}

}
