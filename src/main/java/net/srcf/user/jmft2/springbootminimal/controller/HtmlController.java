package net.srcf.user.jmft2.springbootminimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HtmlController {

  @GetMapping("/html")
  public String htmlPage() {
    return "index"; // This maps to the "index.html" template in the "templates" directory
  }
}
