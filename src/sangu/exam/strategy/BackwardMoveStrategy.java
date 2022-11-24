package sangu.exam.strategy;



public class BackwardMoveStrategy implements MoveStrategy{
    static float STEP_SIZE = 1;
    @Override
    public Position move(Position position) {
        return new Position(position.x-STEP_SIZE, position.y );
    }
}
