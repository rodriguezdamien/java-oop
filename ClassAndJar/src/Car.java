package com.nmeo.cli;
/** Modelizing a car */
public class Car {
  private String driver;
  private int odometer;
  public Car () {odometer=0;driver="";}
  public Car (int odometer) {this();this.odometer=odometer;}
  public Car(String driver) {this();this.driver = driver;}
  public Car(String driver, int odometer) {
  	this(driver);this.odometer=odometer;}
  public String toString() {
  	return "Car of "+driver+" ("+odometer+" km)";}
  public void drive(int dist) {odometer+=dist;}
}
/** Testing the Car class */
class TestCar {
  public static void main(String[] args) {
	if (args.length<1) {System.exit(-1);}
	Car yourCar = new Car(args[0]);
	Car myCar = new Car("Arthur",100);
	System.out.println(myCar+"\n"+yourCar);
  }
}