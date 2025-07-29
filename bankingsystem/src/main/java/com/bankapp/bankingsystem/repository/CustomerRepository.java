package com.bankapp.bankingsystem.repository;

import com.bankapp.bankingsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    boolean existsByEmail(String email);
    boolean existsByMobile(String mobile);
}
