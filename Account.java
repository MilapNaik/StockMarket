public class Account{

 private final int MAXSTOCKS = 10;     // MAX number of stocks 
 private String name;        // name of the user
 private double balance;        // balance
 private Stock[] portfolio;       // array of stocks
 private int totStocks;        // num of stock currently holded
 
 public Account(String name, double balance){
  /*
   * constructor: initalize the name and balance
  */
   
   portfolio = new Stock[10];
    totStocks = 0;
    this.name = name;
    this.balance = balance;
 }

 public void buyStock(Stock s){
  /*
   * buy the stock s if the user has les than MAXSTOCKS and
   * enough balance.
   *
   * This method modify the balance, and the array of stocks
  */
   
  /* if (totStocks < MAXSTOCKS)
   {
     if (s.getCurrentValue() < balance)
   {*/
     portfolio[totStocks] = s;
       totStocks = totStocks + 1;
       balance= balance - s.getCurrentValue();
       
   //}
   //}
  
 }
 
 public Stock sellStock(String name){
  /*
   * sell the stock whish name is passed as input parameter.
   * Return the stock if it present, null otherwise.
   *
   * This method modify the balance, and the array of stocks 
  */
   
   String s1;
   Stock s;
   int i;
   
   for (i = 0; i < totStocks; i++) {
     s = portfolio[i];
    s1 = s.getName();
    
  if (name.equals(s1))
  {
    
   totStocks= totStocks -  1 ;
   balance= balance + portfolio[i].getCurrentValue();
   portfolio[i] = portfolio[i+1];
   return s;
  }
}
   
   
   
  return null;
 }
 
 public double variationAtClosure(){
  /*
   * returns the variation of the value of the stocks at closing.
  */
   double totVariation = 0;
   for (int i = 0; i < totStocks; i++)
   {
     totVariation = totVariation + 
       portfolio[i].getClosingVariation();
   }
  
  return totVariation;
 
 }
 
 public void displayStocks(){
  /*
   * display the stocks information
  */
   
 
   for (int i = 0; i < totStocks; i++)
   {
  String s = "***************************\n";
  s += "* name: " + portfolio[i].getName() + "\n";
  s += "* current value: " + portfolio[i].getCurrentValue() + "\n";
  s += "***************************\n";
  System.out.println(s);
   }
   
 
 }
 public String toString(){
  /*
   * display the account information
  */
  
  String s = "***************************\n";
  s += "* name: " + name + "\n";
  s += "* current balance: " + balance + "\n";
  s += "* tot num of stocks: " + totStocks + "\n";
  s += "***************************\n";
  return s;
 }
 
 

}