package main;

import java.util.Date;

public interface Item {
  
  public final String MANUFACTURER = "OracleProduction";
  
  public void setProductionNumber(int number);
  public void setName(String name);
  public String getName();
  public Date getManufacturedDate();
  public int getSerialNumber();
}