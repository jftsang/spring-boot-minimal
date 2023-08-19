package net.srcf.user.jmft2.springbootminimal.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
  /**
   * Simple GET endpoint
   *
   * @return A greeting
   */
  @GetMapping("/")
  public String indexView() {
    return "Hello, world!";
  }

  /**
   * GET endpoint with a path variable
   *
   * @param name Name of the person to greet
   * @return A greeting for that name
   */
  @GetMapping("/hello/{name}")
  public String greetSomeone(@PathVariable String name) {
    return "Hello, " + name + "!";
  }

  /**
   * Query parameters are read as a map; and maps can be returned directly as JSON. You can also use
   * MultiValueMap instead of Map.
   *
   * @param params Query parameters
   * @return JSON representation of query parameters
   */

  @GetMapping(path = "/json")
  public Map<String, String> getJsonEndpoint(@RequestParam Map<String, String> params) {
    return params;
  }

}
