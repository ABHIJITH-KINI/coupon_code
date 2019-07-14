package org.commerce.couponcodegeneration.vendor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.commerce.couponcodegeneration.vendor.model.Vendor;
import org.commerce.couponcodegeneration.vendor.repository.VendorRepository;
import org.commerce.couponcodegeneration.vendor.utilities.CodeConfig;
import org.commerce.couponcodegeneration.vendor.utilities.CouponCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

	@Autowired
	VendorRepository vendorRepository;
	
	public Iterable<Vendor> getAllVendor() {
		return vendorRepository.findAll();	
	}
	public Optional<Vendor> getVendor(long id){
		return vendorRepository.findById(id);	
	}
	
	public Vendor createVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	public void removeVendorById(long id) {
		vendorRepository.deleteById(id);
	}
	
	public String getCoupon() {
		CodeConfig config = new CodeConfig(null, null,"ABC","XYZ",null);
		return CouponCodes.generate(config);
	}
}
