package com.tcs.organizationrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.organizationrestapi.model.Organization;
import com.tcs.organizationrestapi.repository.OrganizationRepository;

@Service("")
public class OrganizationServiceImpl implements OrganizationService {


	@Autowired
	OrganizationRepository organizationRepository;
	
	
	@Override
	public Organization addOrganization(Organization organization) {
	Organization organization2 = null;
		try {
			organization2 = organizationRepository.save(organization);
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		

	
	}

	@Override
	public Organization updateOrganization(Organization organization) {
		return null;
		
	}

	@Override
	public String deleteOrganization(int id) {
		return null;
	}

	@Override
	public Optional<Organization> findById(int id) {
		return null;
	}

	@Override
	public Optional<List<Organization>> getOrganization() {
		return null;
	}

	

}
