package com.tcs.organizationrestapi.service;

import java.util.List;
import java.util.Optional;

import com.tcs.organizationrestapi.model.Organization;

public interface OrganizationService {

	public Organization addOrganization(Organization organization);
	   public Organization updateOrganization(Organization organization);
	   public String deleteOrganization(int id);
	   public Optional<Organization>findById(int id);
	   public Optional<List<Organization>> getOrganization();
	

	
	
	
	
	
	
	
	
}
