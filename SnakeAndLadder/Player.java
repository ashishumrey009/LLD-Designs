public class Player {
    private String name;
    private int position;

    public Player(String name){
        this.name=name;
        this.position=1;
    }
    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }

    public void setPoition(int position){
        this.position=position;
    }
    
}
