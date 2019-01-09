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
@Table(name = "Shipping_Methods")
@Getter
@Setter
@NoArgsConstructor
public class ShippingMethods {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ShippingMethodID")
  @Getter @Setter private @Id
  int ShippingMethodID;

  @Column(name = "ShippingMethod")
  private String ShippingMethod;

}
