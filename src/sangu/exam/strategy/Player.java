package sangu.exam.strategy;

public class Player {
    private int steps;
    private MoveStrategy moveStrategy;
    private Position currentPosition;

    public Player(Position initialPosition)
    {
        this.currentPosition = initialPosition;
    }

    void setMoveStrategy(MoveStrategy moveStrategy)
    {
        this.moveStrategy = moveStrategy;
    }

    void move(int steps){
        int curSteps = 0;
        while(curSteps < steps)
        {
            currentPosition = moveStrategy.move(currentPosition);
            curSteps++;
        }
    }

    Position getCurrentPosition()
    {
        return currentPosition;
    }
}
