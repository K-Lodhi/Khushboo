package com.Mobile;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MobileBrand {
	private String referenceId;
    private String modelName;
    private Double displaySize;
    private Double price;
    private Date launchedDate;
    
	public MobileBrand(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}

	 public String toString() {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        return "Reference Id: " + referenceId + "\n" +
	               "Model Name: " + modelName + "\n" +
	               "Display Size: " + String.format("%.1f", displaySize) + "\n" +
	               "Price: " + String.format("%.1f", price) + "\n" +
	               "Launched Date: " + sdf.format(launchedDate);
	    }
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        MobileBrand mobile = (MobileBrand) obj;

	        return referenceId.equalsIgnoreCase(mobile.referenceId) &&
	               modelName.equalsIgnoreCase(mobile.modelName);
	    }
    
    

}
