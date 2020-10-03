package com.monitoringActuator.service;

import com.monitoringActuator.domain.Customer;
import com.monitoringActuator.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;


    public Customer findById(final Long id) {
        return customerRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void create(final Customer customer) {
        customerRepository.save(customer);
    }
}
