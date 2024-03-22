package com.maxicorrea.github.applicationdollarbackend.adapters.input.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.maxicorrea.github.applicationdollarbackend.application.ports.input.DisplayHomeInputPort;
import com.maxicorrea.github.applicationdollarbackend.common.Rest;
import com.maxicorrea.github.applicationdollarbackend.domain.Dollar;

@Rest
@RestController
public class ApplicationDollarHomeController {

  private final DisplayHomeInputPort displayHomeInputPort;
  
  @Autowired
  public ApplicationDollarHomeController(
      final DisplayHomeInputPort displayHomeInputPort) {
    this.displayHomeInputPort = displayHomeInputPort;
  }
  
  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)  
  public List<Dollar> home() {
    return displayHomeInputPort.execute();
  }
  
}
