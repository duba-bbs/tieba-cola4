package com.tingyu.domain.customer.gateway;

import com.tingyu.domain.customer.Customer;
import com.tingyu.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
