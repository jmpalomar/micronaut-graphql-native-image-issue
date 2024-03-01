/*
 * Copyright (c) 2024 Energía Plus. All rights reserved.
 */

package example.graphql;

import example.graphql.model.Customer;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CustomersDataFetcher implements DataFetcher<Iterable<Customer>> {

    @Override
    public Iterable<Customer> get(DataFetchingEnvironment environment) throws Exception {

        Customer john = new Customer();
        john.setCustomerId("1");
        john.setFirstName("John");
        john.setLastName("Doe");

        Customer jane = new Customer();
        jane.setCustomerId("2");
        jane.setFirstName("Jane");
        jane.setLastName("Doe");

        return List.of(john, jane);

    }

}
