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
@Table(name = "Employees")
@Getter
@Setter
@NoArgsConstructor
public class Employees {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "EmployeeID")
  @Getter @Setter private @Id
  int EmployeeID;

  @Column(name = "FirstName")
  private String FirstName;

  @Column(name = "LastName")
  private String LastName;

  @Column(name = "Title")
  private String Title;

  @Column(name = "WorkPhone")
  private String WorkPhone;
}
