package com.maxicorrea.github.applicationdollarbackend.domain;

import java.math.BigDecimal;

public class Price {

  private BigDecimal value;
  
  public Price(
      final String strValue) {
    if(strValue != null && !strValue.trim().isEmpty()) {
      String parse = strValue.substring(1);
      value = new BigDecimal(parse);
    }
  }
  
  public BigDecimal getValue() {
    return value;
  }
  
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  
}
