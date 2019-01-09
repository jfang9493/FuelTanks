public class Main {
    public int nextTankToFill(int threshhold)
    {
        int lowest = getCurrentindex();
        for (int i = 0; i < tanks.size(); i++)
        {
            if (tanks.get(lowest) >= tanks.get(i) && tanks.get(i) <= threshold) lowest = 1;
        }
        return lowest;
    }

    public void moveToLocation(int locIndex)
    {
        if (getCurrentIndex() < locIndex)
        {
            if(!isFacingRight()) changeDirection();
            moveForward(locIndex - getCurrentIndex());
        }
        else
        {
            if(isFacingRight()) changeDirection();
            moveForward(getCurrentIndex() - locIndex);
        }
    }
}
