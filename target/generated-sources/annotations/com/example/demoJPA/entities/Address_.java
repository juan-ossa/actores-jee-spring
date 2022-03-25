package com.example.demoJPA.entities;

import com.example.demoJPA.entities.City;
import com.example.demoJPA.entities.Customer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-25T12:43:21")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> address;
    public static volatile SingularAttribute<Address, String> address2;
    public static volatile SingularAttribute<Address, String> phone;
    public static volatile SingularAttribute<Address, String> district;
    public static volatile SingularAttribute<Address, String> postalCode;
    public static volatile SingularAttribute<Address, Date> lastUpdate;
    public static volatile ListAttribute<Address, Customer> customerList;
    public static volatile SingularAttribute<Address, City> cityId;
    public static volatile SingularAttribute<Address, Short> addressId;

}