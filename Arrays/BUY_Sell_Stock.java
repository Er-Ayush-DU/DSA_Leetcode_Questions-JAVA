                                      //  1st Method

// The Time Complexity Of This Method is - O(n)
// And The Space Complexity Of This Method is - O(1)

public class BUY_Sell_Stock {
    static int Max_profit(int[] prices){
      int mini = prices[0];
      int profit = 0;
      for (int i=1;i<prices.length-1;i++){
        int diff = prices[i]-mini;
        profit = Math.max(profit,diff);
        mini = Math.min(mini,prices[i]);
      }  
      System.out.print("The Maximum Profit of Stock is: ");
      return profit;    
    }

  public static void main(String[] args) {
    int [] prices ={7,1,5,3,6,4};
    System.out.println(Max_profit(prices));
  }
  
}


                                    // 2nd Menthod


// The Time Complexity Of This Method is - O(n2)
// And The Space Complexity Of This Method is - O(1)


class Buy_Sell{
  static int MaxProfit(int[] price){
    int profit=0;
    for(int i=0; i<price.length-1; i++){
      for(int j=i+1; j<price.length; j++){
        int diff = price[j]-price[i];
        profit = Math.max(profit,diff);
      }
    }
    System.out.print("The Maximum Profit of Stock is: ");
    return profit;
  }
    
  public static void main(String[] args) {
    int [] price = {4,5,9,6,3};
    System.out.println(MaxProfit(price));   
  }
}