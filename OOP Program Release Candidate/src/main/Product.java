package main;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {
  
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber = 1;
  
  public Product(String name) {
    serialNumber = currentProductionNumber;
    manufacturer = MANUFACTURER;
    manufacturedOn = new Date();
    this.name = name;
    currentProductionNumber ++;
  }
  
    public int compareTo(Product prod) {
        return this.name.compareTo(prod.name);
    }
  
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
          +"Serial Number : " + serialNumber + "\n"
          +"Date : " + manufacturedOn + "\n"
          +"Name : " + name;
  }
  
  public void setProductionNumber(int number) {
    Product.currentProductionNumber = number;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public Date getManufacturedDate() {
    return manufacturedOn;
  }
  public int getSerialNumber() {
    return serialNumber;
  }

}