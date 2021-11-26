package com.Day_30_Cab_Invoice_Generator;

import org.junit.Test;

import junit.framework.Assert;

public class CabInvoiceGeneratorTest 
{
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		CabInvoiceGenerator cig = new CabInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = cig.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinimumFare()
	{
		CabInvoiceGenerator cig = new CabInvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = cig.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare()
	{
		CabInvoiceGenerator cig = new CabInvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5),
						 new Ride(0.1, 1) };
		double fare = cig.calculateFare(rides);
		Assert.assertEquals(30, fare, 0.0);
	}
}
