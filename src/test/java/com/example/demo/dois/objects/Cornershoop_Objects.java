package com.example.demo.dois.objects;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("all")
public class Cornershoop_Objects {
	
	//access
	public String btCancel = "//span[text()='Cancel']";
	public String zipCode = "//input[@placeholder='Zip code']";
	public String btContinue = "//span[text()='Continue']";
	
	//screen after searched
	
	public String headerSiteZipSelected = "shopping-list-selector-control";
	public String panelStores = "//section[@class='slider-container']";
	public String otherStores = "//span[text()='Other stores']";
	
	
	
	public Cornershoop_Objects() {
		
	}
	

}
