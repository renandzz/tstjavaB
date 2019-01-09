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
@Table(name = "Products")
@Getter @Setter @NoArgsConstructor
public class Products {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ProductID")
  @Getter @Setter private @Id int ProductID;

  @Column(name = "ProductName")
  private String ProductName;

  @Column(name = "UnitPrice")
  private String UnitPrice;

  @Column(name = "InStock")
  private String InStock;
}
