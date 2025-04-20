package kyungmin.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

  @GetMapping(value = "/")
  public String index() {
    return "Hello World!";
  }
}
