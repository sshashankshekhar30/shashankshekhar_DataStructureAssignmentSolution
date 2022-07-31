package com.greatlearning.driver;
import com.greatlearning.service.FloorImplementation;

public class Driver {
	public static int totalFloors;
	public static int[] totalFloorSize;

	public static void main(String[] args) 
	{
		FloorImplementation obj = new FloorImplementation();
		obj.getInputs();
		obj.calculateAndPrintOrderOfConstruction(obj.totalFloorSize);

	}

}
