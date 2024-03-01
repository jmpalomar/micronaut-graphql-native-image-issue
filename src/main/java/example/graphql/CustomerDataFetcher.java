/*
 * Copyright (c) 2024 Energía Plus. All rights reserved.
 */

package example.graphql;

import example.graphql.model.Customer;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import jakarta.inject.Singleton;

@Singleton
public class CustomerDataFetcher implements DataFetcher<Customer> {

    @Override
    public Customer get(DataFetchingEnvironment environment) throws Exception {

        String customerId = environment.getArgument("customerId");

        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        return customer;

    }

}
