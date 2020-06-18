package com.techtrilha.terceiroendpoint.control;

import com.techtrilha.terceiroendpoint.model.Remedy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemedyController {

  @GetMapping("/remedies")
  public Remedy generateRemedy(@RequestParam("name") final String name,
                               @RequestParam("description") final String description) {
    final var remedy = new Remedy();
    remedy.setId(1L);
    remedy.setName(name);
    remedy.setDescription(description);
    return remedy;
  }

}
