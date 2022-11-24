package sangu.exam.strategy;



public class DownwardMoveStrategy implements MoveStrategy{
    static float STEP_SIZE = 1;
    @Override
    public Position move(Position position) {
        return new Position(position.x, position.y -STEP_SIZE);
    }
}
