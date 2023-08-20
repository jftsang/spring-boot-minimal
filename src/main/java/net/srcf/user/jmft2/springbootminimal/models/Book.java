package net.srcf.user.jmft2.springbootminimal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

  @Id
  @GeneratedValue
  private Long id;
  private String name;

  // standard constructors

  // standard getters and setters
}