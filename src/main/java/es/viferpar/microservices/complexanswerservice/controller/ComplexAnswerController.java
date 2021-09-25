package es.viferpar.microservices.complexanswerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import es.viferpar.microservices.complexanswerservice.model.FullName;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
public class ComplexAnswerController {

  @GetMapping("/complex-answer")
  public FullName retrieveComplexAnswer() {

    return FullName.builder().firstName("Humphrey").lastName("Bogart").build();

  }

}
