package com.example.demoJPA.entities;

import com.example.demoJPA.entities.Address;
import com.example.demoJPA.entities.Invoice;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-27T20:04:41")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Invoice> invoiceList;
    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, Date> lastUpdate;
    public static volatile SingularAttribute<Customer, Short> customerId;
    public static volatile SingularAttribute<Customer, Boolean> active;
    public static volatile SingularAttribute<Customer, Short> storeId;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, Date> createDate;
    public static volatile SingularAttribute<Customer, Address> addressId;

}