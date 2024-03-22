package com.maxicorrea.github.applicationdollarbackend.application.ports.input;

import java.util.List;
import com.maxicorrea.github.applicationdollarbackend.domain.Dollar;

public interface DisplayHomeInputPort {

  List<Dollar> execute();
  
}
