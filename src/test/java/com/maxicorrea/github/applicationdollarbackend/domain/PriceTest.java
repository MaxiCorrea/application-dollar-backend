package com.maxicorrea.github.applicationdollarbackend.domain;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class PriceTest {

  @Test
  void shouldBeAbleToCreateAPriceFromATextString() {
    String aPrice = "$1000";
    Price price = new Price(aPrice);
    assertEquals(BigDecimal.valueOf(1000) , price.getValue());
  }

}
