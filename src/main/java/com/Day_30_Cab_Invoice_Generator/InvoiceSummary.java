package com.Day_30_Cab_Invoice_Generator;

public class InvoiceSummary 
{
	private int numberOfRides;
	private double totalFare;
	private double averageFare = 0.0;

	public InvoiceSummary(int numberOfRides, double totalFare) 
	{
		this.numberOfRides = numberOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.numberOfRides;
	}
	/*
	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return numberOfRides = that.numberOfRides &&
				Double.compare(that.totalFare, totalFare) == 0 &&
				Double.compare(that.averageFare, averageFare) == 0;
	}*/

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (numberOfRides != other.numberOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}	
	
}
