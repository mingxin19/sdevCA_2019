package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Entity
@Table(name="Address")
@SequenceGenerator(name = "adid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
public class Address extends Model{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="adid_seq")
    private Long id;

    @Constraints.Required
    private String address1;

    @Constraints.Required
    private String address2;

    @Constraints.Required
    private String city;

    @Constraints.Required
    private String postCode;

    public Address() {
    }

    public Address(String address1, String address2, String city, String pC) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postCode = pC;
    }


    public static final Finder<Long, Address> find = new Finder<>(Address.class);
    
    public static final List<Address> findAll() {
        return Address.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public String getAddress1() {
        return this.address1;
    }
    
    public String getAddress2(){
        return this.address2;
    }

    public String getCity(){
        return this.city;
    }
    
    public String getPostCode(){
        return this.postCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(String pC){
        this.postCode = pC;
    }

    
}