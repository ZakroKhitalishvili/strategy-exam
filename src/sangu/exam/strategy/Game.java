package sangu.exam.strategy;

import java.util.Scanner;

public class Game {
    private Player player;

    void start()
    {
        player = new Player(new Position(0,0));
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            String dir =  sc.next();

            if(dir.equals("UPWARD"))
            {
                player.setMoveStrategy(new ForwardMoveStrategy());
                player.move(1);
                System.out.println("Moved");
                continue;
            }
            if(dir.equals("DOWNWARD"))
            {
                player.setMoveStrategy(new DownwardMoveStrategy());
                player.move(1);
                System.out.println("Moved");
                continue;
            }
            if(dir.equals("FORWARD"))
            {
                player.setMoveStrategy(new ForwardMoveStrategy());
                player.move(1);
                System.out.println("Moved");
                continue;
            }

            if(dir.equals("BACKWARD"))
            {
                player.setMoveStrategy(new BackwardMoveStrategy());
                player.move(1);
                System.out.println("Moved");
                continue;
            }

            if(dir.equals("STOP"))
            {
                var currentPosition = player.getCurrentPosition();
                System.out.println("Current position is x: "+ currentPosition.x+ ", y: "+currentPosition.y);
                break;
            }

            System.out.println("Wrong command");

        }
    }
}
