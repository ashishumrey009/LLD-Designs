import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final int  size;
    private final Map<Integer,Integer> snakes = new HashMap<>();
     private final Map<Integer, Integer> ladders = new HashMap<>();

     public Board(int size ,List<Snake> snakeList, List<Ladder> ladderList){
        this.size =size;
        for(Snake s: snakeList){
            snakes.put(s.getHead(),s.getTail());
        }
        for(Ladder l: ladderList){
            ladders.put(l.getStart(),l.getEnd());
        }
    }

        

        public int getNextPosition(int current){
            if(snakes.containsKey(current)){
                System.out.println("Oops! Bitten by snake.");
                return snakes.get(current);
            }
            if(ladders.containsKey(current)){
                System.out.println("Yay! Climbed a ladder.");
                return ladders.get(current);
            }
            return current;
        }
     

     public int getSize() {
       return size;
     }
}
