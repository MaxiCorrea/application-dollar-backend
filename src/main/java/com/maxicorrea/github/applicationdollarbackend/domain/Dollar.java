package com.maxicorrea.github.applicationdollarbackend.domain;

import java.math.BigDecimal;

public class Dollar {

  private String name;
  private BigDecimal valuePurchase;
  private BigDecimal valueSale;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getValuePurchase() {
    return valuePurchase;
  }

  public void setValuePurchase(BigDecimal valuePurchase) {
    this.valuePurchase = valuePurchase;
  }

  public BigDecimal getValueSale() {
    return valueSale;
  }

  public void setValueSale(BigDecimal valueSale) {
    this.valueSale = valueSale;
  }

}
