package com.laz.hackathon.ninja.beans;

import java.math.BigDecimal;

public class Mass {
    BigDecimal measurement;
	String unitOfMeasure;
    
    public BigDecimal getMeasurement() {
		return measurement;
	}
	
    public void setMeasurement(BigDecimal weight) {
		this.measurement = weight;
	}

    public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	
    public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	
    	if ( measurement.compareTo(BigDecimal.ZERO) > 1 ) {
    		sb.append(this.measurement.toString() + " ");
        	sb.append(this.unitOfMeasure);
    	}
    	
    	return sb.toString();
    }

}
