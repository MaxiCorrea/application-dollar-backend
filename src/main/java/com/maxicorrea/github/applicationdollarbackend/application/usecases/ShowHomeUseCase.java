package com.maxicorrea.github.applicationdollarbackend.application.usecases;

import java.util.List;
import com.maxicorrea.github.applicationdollarbackend.application.ports.input.DisplayHomeInputPort;
import com.maxicorrea.github.applicationdollarbackend.application.ports.output.RetriveHomeOutputPort;
import com.maxicorrea.github.applicationdollarbackend.common.UseCase;
import com.maxicorrea.github.applicationdollarbackend.domain.Dollar;

@UseCase
public class ShowHomeUseCase implements DisplayHomeInputPort {

  private RetriveHomeOutputPort retriveHomeOutputPort;

  public ShowHomeUseCase(final RetriveHomeOutputPort retriveHomeOutputPort) {
    this.retriveHomeOutputPort = retriveHomeOutputPort;
  }

  @Override
  public List<Dollar> execute() {
    return retriveHomeOutputPort.execute();
  }

}
