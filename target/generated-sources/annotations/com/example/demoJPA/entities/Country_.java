package com.example.demoJPA.entities;

import com.example.demoJPA.entities.City;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-25T12:43:22")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, String> country;
    public static volatile SingularAttribute<Country, Date> lastUpdate;
    public static volatile ListAttribute<Country, City> cityList;
    public static volatile SingularAttribute<Country, Short> countryId;

}