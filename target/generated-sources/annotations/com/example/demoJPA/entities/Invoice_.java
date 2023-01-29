package com.example.demoJPA.entities;

import com.example.demoJPA.entities.Customer;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-01-29T05:37:08")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Date> date;
    public static volatile SingularAttribute<Invoice, BigDecimal> hours;
    public static volatile SingularAttribute<Invoice, BigDecimal> rate;
    public static volatile SingularAttribute<Invoice, String> service;
    public static volatile SingularAttribute<Invoice, Boolean> paid;
    public static volatile SingularAttribute<Invoice, Customer> customerId;
    public static volatile SingularAttribute<Invoice, Short> invoiceId;

}