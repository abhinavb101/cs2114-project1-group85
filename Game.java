

import finalCode.Location;
import finalCode.Pilgrim;

public class Game
{
    //~ Fields ................................................................
    private Pilgrim player;
    private Location currentRoom;
    //~ Constructors ..........................................................
    public Game() {
        player = new Pilgrim();
        currentRoom = player.getCurrentRoom();
    }
    //~Public  Methods ........................................................
    public void play() {
        boolean playing = true;
        
        System.out.println("Welcom to the Shattered Lands, the treasherous" + 
        "Unrelenting expanse that is kind to no one! Traverse these lands" +
            "successfully and earn your great reward!");
        
        while (playing && player.isAlive()) {
            player.displayLocation();
        }
    }
}
