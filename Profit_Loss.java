class Profit_Loss 
{
    public static void main(String[] args) 
	{
        int cost_price=1400;
        int selling_price=1600,profit,loss;
        profit = selling_price - cost_price;
        loss = cost_price - selling_price;
        if(selling_price>cost_price)
        {
            System.out.println("profit="+profit);
        }
        else if(cost_price>selling_price)
        {
            System.out.println("loss="+loss);
        }
        else
        {
            System.out.println("no profit no loss");
        }
    }
}