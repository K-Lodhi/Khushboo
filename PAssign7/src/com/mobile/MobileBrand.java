package com.mobile;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MobileBrand {

	 private String name;
	    private List<Mobile> mobileList;
 
	    public MobileBrand() {
	        this.mobileList = new ArrayList<>();
	    }
	    
	    public MobileBrand(String name) {
	        this.name = name;
	        this.mobileList = new ArrayList<>();
	    }
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public List<Mobile> getMobileList() {
	        return mobileList;
	    }

	    public void setMobileList(List<Mobile> mobileList) {
	        this.mobileList = mobileList;
	    }

	    public void addMobileToMobileBrand(Mobile mobile) {
	        this.mobileList.add(mobile);
	        System.out.println("Mobile successfully added");
	    }

	    public Boolean removeMobileFromMobileBrand(String referenceId) {
	        for (Mobile mobile : mobileList) {
	            if (mobile.getReferenceId().equals(referenceId)) {
	                mobileList.remove(mobile);
	                System.out.println("Mobile successfully deleted");
	                return true;
	            }
	        }
	        System.out.println("Mobile not found in the Mobile Brand");
	        return false;
	    }

	    public void displayMobiles() {
	        if (mobileList.isEmpty()) {
	            System.out.println("No mobiles to show");
	        } else {
	            System.out.println("Mobiles in " + this.name);
	            System.out.format("%-15s %-15s %-12s %-8s %s\n", "Reference Id", "Model Name", "Display Size", "Price", "Launched Date");
	            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	            for (Mobile mobile : mobileList) {
	                System.out.format("%-15s %-15s %-12s %-8s %s\n", mobile.getReferenceId(), mobile.getModelName(), 
	                                  String.format("%.1f", mobile.getDisplaySize()), 
	                                  String.format("%.1f", mobile.getPrice()), 
	                                  dateFormat.format(mobile.getLaunchedDate()));
	            }
	        }
	    }
}
