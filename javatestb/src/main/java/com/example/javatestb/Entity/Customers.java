package com.example.javatestb.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Customers")
@Getter
@Setter
@NoArgsConstructor
public class Customers {

  public Integer getCustomerID;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "CustomerID")
  @Getter @Setter private @Id int CustomerID;

  @Column(name = "CompanyName")
  @Getter @Setter private String CompanyName;

  @Column(name = "FirstName")
  @Getter @Setter private String FirstName;

  @Column(name = "LastName")
  @Getter @Setter private String LastName;

  @Column(name = "BillingAddress")
  @Getter @Setter private String BillingAddress;

  @Column(name = "City")
  @Getter @Setter private String City;

  @Column(name = "StateOrProvince")
  @Getter @Setter private String StateOrProvince;

  @Column(name = "ZIPCode")
  @Getter @Setter private String ZIPCode;

  @Column(name = "Email")
  @Getter @Setter private String Email;

  @Column(name = "CompanyWebsite")
  @Getter @Setter private String CompanyWebsite;

  @Column(name = "PhoneNumber")
  @Getter @Setter private String PhoneNumber;

  @Column(name = "FaxNumber")
  @Getter @Setter private String FaxNumber;

  @Column(name = "ShipAddress")
  @Getter @Setter private String ShipAddress;

  @Column(name = "ShipCity")
  @Getter @Setter private String ShipCity;

  @Column(name = "ShipStateOrProvince")
  @Getter @Setter private String ShipStateOrProvince;

  @Column(name = "ShipZIPCode")
  @Getter @Setter private String ShipZIPCode;

  @Column(name = "ShipPhoneNumber")
  @Getter @Setter private String ShipPhoneNumber;
}
