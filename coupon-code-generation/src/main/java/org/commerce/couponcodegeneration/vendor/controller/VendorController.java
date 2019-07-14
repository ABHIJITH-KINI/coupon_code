package org.commerce.couponcodegeneration.vendor.controller;

import java.util.Optional;

import org.commerce.couponcodegeneration.vendor.model.Vendor;
import org.commerce.couponcodegeneration.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	VendorService vendorService;
	
	@GetMapping
	public Iterable<Vendor> getAllVendor() {
		return vendorService.getAllVendor();
	}
	
	@GetMapping("/{id}")
	public Optional<Vendor> getVendor(@PathVariable(value = "id") Long id){
		return vendorService.getVendor(id);
	}
	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorService.createVendor(vendor);
	}
	@DeleteMapping("/{id}")
	public void removeVendor(@PathVariable(value = "id") Long id){
		 vendorService.removeVendorById(id);
	}
	@GetMapping("/coupon")
	public String getCoupon() {
		return vendorService.getCoupon();
	}
}
