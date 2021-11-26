package com.Day_30_Cab_Invoice_Generator;

public class CabInvoiceGenerator 
{
	private static final int COST_PER_MINUTE = 1;
	private static final double MINIMUM_COST_PER_KM = 10.0;
	private static final double MIN_FARE = 5;
	
	
	public double calculateFare(double distance, int time)
	{
		double totalFare = (distance * MINIMUM_COST_PER_KM) + (time * COST_PER_MINUTE);
		if(totalFare <= MIN_FARE)
		{
			return MIN_FARE;
		}
		return totalFare;
		//return Math.max(totalFare, MIN_FARE);
	}
	
	public InvoiceSummary calculateFare(Ride[] rides)
	{
		double totalFare =0;
		for(Ride ride : rides)
		{
			totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
