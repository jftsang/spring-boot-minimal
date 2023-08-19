package net.srcf.user.jmft2.springbootminimal;

import static java.util.Map.entry;

import java.util.Map;
import org.springframework.web.bind.annotation.*;
import org.springframework.util.MultiValueMap;

@RestController
public class PostController {


  @PostMapping("/submit/message")
  public Map<String, String> greet(@RequestBody String message) {
    return Map.ofEntries(
        entry("reply", "Thank you for your message"),
        entry("message", message)
    );
  }

  @PostMapping("/submit/form")
  public String submitForm(@RequestParam MultiValueMap<String, String> formData) {
    // Process the form data and generate a response
    String firstName = formData.getFirst("firstName");
    String lastName = formData.getFirst("lastName");

    return "Form submitted: " + firstName + " " + lastName;
  }

  @PostMapping("/process")
  public String processJson(@RequestBody JsonData jsonData) {
    // Process the JSON data and generate a response
    StringBuilder response = new StringBuilder();
    response.append("Received JSON data:\n");
    response.append("Number: ").append(jsonData.getId()).append("\n");
    response.append("String: ").append(jsonData.getName()).append("\n");
    response.append("Array of Strings: ").append(jsonData.getNeighbors()).append("\n");

    return response.toString();
  }
}

