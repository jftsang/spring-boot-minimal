package net.srcf.user.jmft2;

import java.util.List;
import lombok.*

@Getter @Setter @ToString
public class Country {

  private int id;
  private String name;
  private List<Country> neighbors;
}
