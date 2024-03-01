/*
 * Copyright (c) 2024 Energía Plus. All rights reserved.
 */

package example.graphql.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Customer {

    // Attributes
    String customerId;
    String firstName;
    String lastName;

    // Methods
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
