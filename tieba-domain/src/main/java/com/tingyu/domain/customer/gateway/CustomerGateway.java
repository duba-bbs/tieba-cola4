package com.tingyu.domain.customer.gateway;

import com.tingyu.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
