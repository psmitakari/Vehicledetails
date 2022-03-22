package com.lti.boot.dao;

import java.util.List;

import com.lti.boot.pojo.Vehicle;

public interface VehicleDAO 
{
	public boolean addVehicle(Vehicle vehicle);
	public List<Vehicle>getVehicles();

}
