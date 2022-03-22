package com.lti.boot.service;

import java.util.List;

import com.lti.boot.pojo.Vehicle;

public interface VehicleService 
{
	public boolean addVehicle(Vehicle vehicle);
	public List<Vehicle>getVehicles();

}
