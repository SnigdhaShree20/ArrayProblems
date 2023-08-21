
public class BuyAndsellStock {

	public static void findMaxProfit(int[]price)
	{
		int min=price[0];
		int profit;
		int max=0;
		for(int i=0;i<price.length;i++)
		{
			min=Math.min(price[i],min);
			profit=Math.abs(min-price[i]);
			if(profit>max)max=profit;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,4,1,5,2,1,10,11,8};
findMaxProfit(arr);
	}

}
