package com.maxicorrea.github.applicationdollarbackend.application.ports.output;

import java.util.List;
import com.maxicorrea.github.applicationdollarbackend.domain.Dollar;

public interface RetriveHomeOutputPort {

  List<Dollar> execute();
  
}
