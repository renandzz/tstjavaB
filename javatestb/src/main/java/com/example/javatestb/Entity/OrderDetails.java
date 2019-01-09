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
@Table(name = "Order_Details")
@Getter
@Setter
@NoArgsConstructor
public class OrderDetails {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "OrderDetailID")
  @Getter @Setter private @Id
  int OrderDetailID;

  @Column(name = "OrderID")
  private int OrderID;

  @Column(name = "ProductID")
  private int ProductID;

  @Column(name = "Quantity")
  private int Quantity;

  @Column(name = "UnitPrice")
  private int UnitPrice;

  @Column(name = "Discount")
  private int Discount;
}
