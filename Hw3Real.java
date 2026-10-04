package homewrk;


	class SingleTable
	{
	    private int numSeats;
	    private int height;
	    private double viewQuality;

	    public SingleTable(int seats, double view, int tableHeight)
	    {
	        numSeats = seats;
	        viewQuality = view;
	        height = tableHeight;
	    }

	    public int getNumSeats()
	    {
	        return numSeats;
	    }

	    public int getHeight()
	    {
	        return height;
	    }

	    public double getViewQuality()
	    {
	        return viewQuality;
	    }

	    public void setViewQuality(double value)
	    {
	        viewQuality = value;
	    }
	}


	class CombinedTable
	{
	    private SingleTable table1;
	    private SingleTable table2;

	    public CombinedTable(SingleTable t1, SingleTable t2)
	    {
	        table1 = t1;
	        table2 = t2;
	    }

	    public boolean canSeat(int num)
	    {
	        return num <= table1.getNumSeats()
	                  + table2.getNumSeats() - 2;
	    }

	    public double getDesirability()
	    {
	        double average = (table1.getViewQuality()
	                         + table2.getViewQuality()) / 2.0;

	        if (table1.getHeight() == table2.getHeight())
	        {
	            return average;
	        }
	        else
	        {
	            return average - 10.0;
	        }
	    }
	}


	public class Hw3Real
	{
	    public static void main(String[] args)
	    {
	        // Create the three tables from the question
	        SingleTable t1 = new SingleTable(4, 60.0, 74);
	        SingleTable t2 = new SingleTable(8, 70.0, 74);
	        SingleTable t3 = new SingleTable(12, 75.0, 76);

	        // Create c1 using t1 and t2
	        CombinedTable c1 = new CombinedTable(t1, t2);

	        System.out.println(c1.canSeat(9));
	        System.out.println(c1.canSeat(11));
	        System.out.println(c1.getDesirability());

	        // Create c2 using t2 and t3
	        CombinedTable c2 = new CombinedTable(t2, t3);

	        System.out.println(c2.canSeat(18));
	        System.out.println(c2.getDesirability());

	        // Change t2's view quality
	        t2.setViewQuality(80);

	        System.out.println(c2.getDesirability());
	    }
	}

