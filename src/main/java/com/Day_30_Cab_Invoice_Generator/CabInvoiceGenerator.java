package com.Day_30_Cab_Invoice_Generator;

public class CabInvoiceGenerator 
{
	private static final int COST_PER_MINUTE = 1;
	private static final double MINIMUM_COST_PER_KM = 10.0;
	private static final double MIN_FARE = 5;
	private RideRepository rideRepository;
	
	public CabInvoiceGenerator()
	{
		this.rideRepository = new RideRepository();
	}
	
	public double calculateFare(double distance, int time)
	{
		double totalFare = (distance * MINIMUM_COST_PER_KM) + (time * COST_PER_MINUTE);
		return Math.max(totalFare, MIN_FARE);
//		if(totalFare <= MIN_FARE)
//		{
//			return MIN_FARE;
//		}
//		return totalFare;
		
	}
	
//	public InvoiceSummary calculateFare(Ride[] rides)
//	{
//		double totalFare =0;
//		for(Ride ride : rides)
//		{
//			totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
//		}
//		return totalFare;
//	}
	
	public InvoiceSummary calculateFare(Ride[] rides)
	{
		double totalFare =0;
		for(Ride ride : rides)
		{
			totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
	
	public void addRides(String userId, Ride[] rides) 
	{
        rideRepository.addRide(userId, rides);
    }

    public InvoiceSummary getInvoiceSummary(String userId) 
    {
        return this.calculateFare( rideRepository.getRides(userId));
    }
}
