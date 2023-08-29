class Calculate_rectangle
{
    public static void main(String[] args) 
	{
        int length=5,breadth=4;
        int area_of_the_rectangle=length*breadth;
        int perimeter_of_the_rectangle=2*(length+breadth);
        if(area_of_the_rectangle > perimeter_of_the_rectangle)
        {
            System.out.println("area is grater");
        }
        else
        {
            System.out.println("perimeter is smaller");
        }
    }
}