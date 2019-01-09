package com.example.javatestb.Entity;

import java.util.Date;
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
@Table(name = "Orders")
@Getter
@Setter
@NoArgsConstructor
public class Orders {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "OrderID")
  @Getter @Setter private @Id
  int OrderID;

  @Column(name = "CustomerID")
  private int CustomerID;

  @Column(name = "EmployeeID")
  private int EmployeeID;

  @Column(name = "OrderDate")
  private Date OrderDate;

  @Column(name = "PurchaseOrderNumber")
  private String PurchaseOrderNumber;

  @Column(name = "ShipDate")
  private Date ShipDate;

  @Column(name = "ShippingMethodID")
  private int ShippingMethodID;

  @Column(name = "FreightCharge")
  private int FreightCharge;

  @Column(name = "Taxes")
  private int Taxes;

  @Column(name = "PaymentReceived")
  private Character PaymentReceived;

  @Column(name = "Comment")
  private String Comment;

}
