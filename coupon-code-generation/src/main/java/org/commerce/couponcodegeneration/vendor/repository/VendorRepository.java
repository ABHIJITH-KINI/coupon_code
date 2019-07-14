package org.commerce.couponcodegeneration.vendor.repository;

import org.commerce.couponcodegeneration.vendor.model.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long> {

}
