package finalCode;
import student.adventure.Command;
import student.adventure.*;
import java.util.*;


public class Adventure
extends Game
{
    
    public Adventure()
    {
        super(new Pilgrim(), new Parser());
    }


    @Override
    public String welcomeMessage()
    {
        // TODO Auto-generated method stub
        return "Testing";
    }

    public static void main(String[] args)
    {
        Adventure game = new Adventure();
        game.play();
    }
    
    @Override
    public void createCommands()
    {
        // TODO Auto-generated method stub
        CommandWords commands = parser().commandWords();
        commands.addCommand("go", new GoCommand());
        commands.addCommand("Help", new HelpCommand(commands));
        commands.addCommand("quit", new QuitCommand());
        commands.addCommand("north", new MovementCommand("north"));
        commands.addCommand("south", new MovementCommand("south"));
        commands.addCommand("east", new MovementCommand("east"));
        commands.addCommand("west", new MovementCommand("west"));
        commands.addCommand("northeast", new MovementCommand("northeast"));
        commands.addCommand("southeast", new MovementCommand("southeast"));
        commands.addCommand("northwest", new MovementCommand("northwest"));
        commands.addCommand("southwest", new MovementCommand("southwest"));
        commands.addCommand("attack", new AttackCommand());
        commands.addCommand("challange", new ChallengeCommand());
        commands.addCommand("drop", new DropCommand());
        commands.addCommand("take", new TakeCommand());
        commands.addCommand("use", new UseCommand());
    }


    @Override
    public void createRooms()
    {

        Location SunCross = new Location("Sunless Cross",
            "You find yourself in Sunless Cross, "
                + "an almost barren wastland deprived of any life, "
                + "yet something lingers around you.", 
            false);
        
        Weapon brokenBlade =
            new Weapon("Broken Blade", "A worn down, completely broken blade ", true, 1);
        Weapon reward = new Weapon("Kunai","Throwable blades, sharp to the touch", true, 2);
        Enemies bandit = new Enemies("Weak Bandit", 2, 10, reward);    
        SunCross.addItem(brokenBlade);
        //wll
        
        SunCross.addEnemy(bandit);
        player().setCurrentRoom(SunCross);
    }
}
