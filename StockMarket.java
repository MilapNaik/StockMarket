/*
* cs170-001 SPRING 2012
* HW7
* StockMarket:
*  Simulates the actions related to Account objects
*/

public class StockMarket{


 public static void main(String[] args){
 
  // make a new account and buy 3 stocks
  Account myacc = new Account("Stud1", 1000);
  myacc.buyStock(new Stock("UPA", 250));
  myacc.buyStock(new Stock("OPP", 600));
  myacc.buyStock(new Stock("SUN", 100));
  
  // display the stocks owned
  System.out.println("Stocks owned: ");
  myacc.displayStocks();
  
  // display the variation of the stocks at closure
  System.out.println("Variation at closure: " + myacc.variationAtClosure());
  System.out.println();
  
  // diplay the stocks
  myacc.displayStocks();
  System.out.println(myacc);
  
  // sell the stock wich name is SUN and display the account info
  myacc.sellStock("SUN");
  System.out.println(myacc);
 }


}