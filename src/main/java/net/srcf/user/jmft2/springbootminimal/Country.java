package net.srcf.user.jmft2.springbootminimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Country {

  private int id;
  private String name;
  private String capital;
//  private List<Country> neighbors;

  public static Map<Integer, Country> countryMap = Map.ofEntries(
      Map.entry(1, new Country(1, "France", "Paris")),
      Map.entry(2, new Country(2, "England", "London"))
  );

  public static List<Country> listCountries() {
    List<Country> countries = new ArrayList<>(countryMap.values());
    return countries;
  }
}
