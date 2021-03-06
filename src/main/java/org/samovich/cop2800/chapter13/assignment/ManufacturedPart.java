package org.samovich.cop2800.chapter13.assignment;

import java.io.Serializable;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */
public class ManufacturedPart extends Part implements Serializable
{
	private static final long serialVersionUID = 1L;
	private double laborCost;
	private double materialCost;
	public ManufacturedPart() throws InvalidProductionArgumentException
	{
		this(0, 0, 0);
	}
	public ManufacturedPart(int id) throws InvalidProductionArgumentException
	{
		this(id, 0, 0);
	}
	public ManufacturedPart(int id, double lCost, double mCost) throws InvalidProductionArgumentException
	{
		this(id, DEFAULT_PART_DESCRIPTION, 0,
				lCost, mCost);
	}
	public ManufacturedPart(int id, String desc, double sellPrice,  //for PArt object
			double lCost, double mCost) throws InvalidProductionArgumentException  //for this object
	{
		super(id, desc, sellPrice);
		this.setLaborCost(lCost);
		this.setMaterialCost(mCost);
	}
	public double getProductCost ()
	{
		return laborCost + materialCost;
	}
	public double getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(double laborCost) throws InvalidProductionArgumentException {
		if (laborCost >= 0)
			this.laborCost = laborCost;
		else
			throw new InvalidProductionArgumentException("The labor cost was invalid");
	}
	public double getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(double materialCost) throws InvalidProductionArgumentException {
		if (materialCost >= 0)
			this.materialCost = materialCost;
		else
			throw new InvalidProductionArgumentException("The material cost was invalid");
	}	
	public String toString()
	{
		return super.toString() + "\n" +
				"\tLabor Cost: " + this.getLaborCost() + "\n" +
				"\tMaterial Cost: " + this.getMaterialCost();
	}
}

