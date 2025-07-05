import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private final Board board;
    private final Queue<Player> players;
    private final Dice dice = new Dice();

    public Game(Board board, List<Player> playerList){
        this.board= board;
        this.players= new LinkedList<>(playerList);
    }
    public void start(){
        boolean won =false;
        while(!won){
            Player current = players.poll();
            int roll = dice.roll();
            System.out.println(current.getName()+" rolled a ->"+roll);

            int nextPos = current.getPosition()+roll;

            if(nextPos>board.getSize()){
                System.out.println("Can't move. Need exact roll.");
            }else{
                int finalPos = board.getNextPosition(nextPos);
                System.out.println(current.getName()+" moved to "+finalPos);
                current.setPoition(finalPos);
                if(finalPos==board.getSize()){
                    System.out.println(current.getName() + " wins the game!");
                    won = true;
                    break;
                }
            }
             players.offer(current);
        }
    }

}
