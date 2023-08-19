package net.srcf.user.jmft2.springbootminimal.controller;

import java.util.List;

import net.srcf.user.jmft2.springbootminimal.domain.Country;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {


  @GetMapping("/countries")
  public List<Country> listCountries() {
    return (Country.listCountries());
  }

  @GetMapping("/countries/{id}")
  public Country getCountry(@PathVariable int id) throws Exception {
    Country country = Country.countryMap.get(id);
    if (country == null) {
      throw new CountryNotFoundException(String.format("Country %d not found", id));
    }
    return country;
  }

  @PostMapping("/countries/add")
  public String addCountry(@RequestBody Country country) {
    return country.toString();
  }


  @ResponseStatus(HttpStatus.NOT_FOUND)
  static class CountryNotFoundException extends RuntimeException {

    public CountryNotFoundException(String message) {
      super(message);
    }
  }

}
