package net.srcf.user.jmft2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/submit")
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
        response.append("Number: ").append(jsonData.getNumber()).append("\n");
        response.append("String: ").append(jsonData.getString()).append("\n");
        response.append("Array of Strings: ").append(jsonData.getStrings()).append("\n");

        return response.toString();
    }

    @PostMapping("/countries/add")
    public String addCountry(@RequestBody Country country) {
        return country.toString();
    }
}

