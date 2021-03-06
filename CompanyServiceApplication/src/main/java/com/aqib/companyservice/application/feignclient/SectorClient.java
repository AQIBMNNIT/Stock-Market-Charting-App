package com.aqib.companyservice.application.feignclient;

import com.aqib.companyservice.application.dto.CompanyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("sector-service")
public interface SectorClient 
{
	@PostMapping("/sectors/{sectorName}/companies")
	public void addCompanyToSector(@PathVariable String sectorName, @RequestBody CompanyDto companyDto);
}
