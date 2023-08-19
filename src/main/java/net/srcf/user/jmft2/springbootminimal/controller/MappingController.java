package net.srcf.user.jmft2.springbootminimal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class MappingController {

  private final RequestMappingHandlerMapping handlerMapping;

  @Autowired
  public MappingController(RequestMappingHandlerMapping handlerMapping) {
    this.handlerMapping = handlerMapping;
  }

  @GetMapping("/listMappings")
  public List<String> listMappings() {
    List<String> mappings = new ArrayList<>();
    Map<RequestMappingInfo, HandlerMethod> map = handlerMapping.getHandlerMethods();

    for (RequestMappingInfo info : map.keySet()) {
      mappings.addAll(info.getPatternsCondition().getPatterns());
    }

    return mappings;
  }
}
