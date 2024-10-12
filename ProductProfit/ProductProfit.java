package ProductProfit;
import java.util.Scanner;
public class ProductProfit {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("What is the cost price?");
        double costPrice = input.nextDouble();
        
        System.out.println("What is the profit percentage?");
        double profitPercentage = input.nextDouble();
        
        double profitAmount = (costPrice * profitPercentage / 100);
        double sellingPriceCash = costPrice + profitAmount;
        double sellingPriceInstallments = sellingPriceCash * 1.05;
        double cashTax = sellingPriceCash * 0.17;
        
        System.out.println("Profit Amount: " + profitAmount);
        System.out.println("Cash Selling Price: " + sellingPriceCash);
        System.out.println("Installments Selling Price: " + sellingPriceInstallments);
        System.out.println("Cash Tax: " + cashTax);
        
        input.close();
	}
}
