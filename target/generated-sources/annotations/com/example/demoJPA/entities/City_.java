package com.example.demoJPA.entities;

import com.example.demoJPA.entities.Address;
import com.example.demoJPA.entities.Country;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-27T20:04:41")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> city;
    public static volatile ListAttribute<City, Address> addressList;
    public static volatile SingularAttribute<City, Date> lastUpdate;
    public static volatile SingularAttribute<City, Short> cityId;
    public static volatile SingularAttribute<City, Country> countryId;

}