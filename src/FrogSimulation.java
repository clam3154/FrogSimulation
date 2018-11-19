public class FrogSimulation
{

    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dis, int numHops)
    {
        goalDistance = dis;
        maxHops = numHops;
    }
    private int hopDistance()
    {
        int random = -4+(int)(Math.random()*20);
        System.out.print(random + " ");
        return random;
    }
    public boolean simulate()
    {
        int position = 0;
        for (int count = 0; count < maxHops; count++)
        {
            position += hopDistance();
            if (position >= goalDistance)
            {
                System.out.print("Success Final Distance : " + position + "\n");
                return true;
            }
            else if (position < 0)
            {
                System.out.print("Failed Reached Negative Distance : " + position + "\n");
                return false;
            }
        }
        System.out.print("Failed Final Distance : " + position + "\n");
        return false;
    }
    public double runSimulations(int num)
    {
        int countSuccess = 0;
        for (int count = 0; count < num; count++)
        {
            System.out.print("Goal : " + goalDistance + " Hops: ");
            if(simulate())
            {
                countSuccess++;
            }
        }
        return (double)countSuccess / num;
    }
}
