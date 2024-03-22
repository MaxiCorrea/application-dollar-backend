package com.maxicorrea.github.applicationdollarbackend.domain;

public class Dollar {

  private String name;
  private Price valuePurchase;
  private Price valueSale;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Price getValuePurchase() {
    return valuePurchase;
  }

  public void setValuePurchase(Price price) {
    this.valuePurchase = price;
  }

  public Price getValueSale() {
    return valueSale;
  }

  public void setValueSale(Price price) {
    this.valueSale = price;
  }

}
