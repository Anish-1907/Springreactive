package com.training.bms.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.training.bms.model.CustomerRegistration;

import reactor.core.publisher.Mono;


public interface CustomerRepository extends ReactiveCrudRepository<CustomerRegistration, Integer>{
	
}
