package kyungmin.cicd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CheckController {

  @Value("${user-name}")
  private String name;

  @GetMapping(value = "/")
  public String index() {
    System.out.println("이름은? " + name);
    return "Hello World!";
  }
}
