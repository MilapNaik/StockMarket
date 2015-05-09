/*
* cs170-001 SPRING 2012
* HW7
* Stock:
*  Represents a stock in the market
*/

public class Stock{

 private String name;  // name of the stock
 private double value;  // value of the stock
 
 public Stock(String name, double value){
  /*
   * constructor, it initialize the name and the value
  */
  this.name = name;
  this.value = value;
 }
 
 public String getName(){
  return name;
 }
 
 public double getCurrentValue(){
  return value;
 }
 
 public double getClosingVariation(){
  /*
   * it returns the variation in the value of the stock,
   * and updates the current value.
  */
  
  double var = (Math.random() - 0.5) * value/4;
  value += var;
  return var;
 }
 
 public String toString(){
  String s = "***************************\n";
  s += "* name: " + name + "\n";
  s += "* current value: " + value + "\n";
  s += "***************************\n";
  return s;
 }

}