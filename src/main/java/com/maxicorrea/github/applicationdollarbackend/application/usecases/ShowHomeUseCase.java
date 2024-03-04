package com.maxicorrea.github.applicationdollarbackend.application.usecases;

import com.maxicorrea.github.applicationdollarbackend.application.ports.input.DisplayHomeInputPort;
import com.maxicorrea.github.applicationdollarbackend.application.ports.output.RetriveHomeOutputPort;
import com.maxicorrea.github.applicationdollarbackend.common.UseCase;
import com.maxicorrea.github.applicationdollarbackend.domain.Home;

@UseCase
public class ShowHomeUseCase implements DisplayHomeInputPort {

  private RetriveHomeOutputPort retriveHomeOutputPort;

  public ShowHomeUseCase(final RetriveHomeOutputPort retriveHomeOutputPort) {
    this.retriveHomeOutputPort = retriveHomeOutputPort;
  }

  @Override
  public Home execute() {
    return retriveHomeOutputPort.execute();
  }

}
