package com.Day_30_Cab_Invoice_Generator;

public class CabInvoiceGenerator 
{
	private static final int COST_PER_MINUTE = 1;
	private static final double MINIMUM_COST_PER_KM = 10.0;

	public double calculateFare(double distance, int time)
	{
		double fare = (distance * MINIMUM_COST_PER_KM) + (time * COST_PER_MINUTE);
		return fare;
	}

}
