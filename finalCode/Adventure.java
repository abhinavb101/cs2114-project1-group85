package finalCode;
import student.adventure.*;
public class Adventure extends Game
{
    public Adventure() {
        super(new Pilgrim(), new Parser());
    }

    @Override
    public String welcomeMessage()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void createCommands()
    {
        // TODO Auto-generated method stub
        CommandWords commands = parser().commandWords();
        commands.addCommand("go", new GoCommand());
        commands.addCommand("Help", new HelpCommand(commands));
        commands.addCommand("quit", new QuitCommand());
    }

    @Override
    public void createRooms()
    {
        // TODO Auto-generated method stub
        
    }
    
    public Pilgrim getPilgrim()
    {
        return null;
    }
    
    public void placeItems()
    {
        
    }
    
    public void connectRooms()
    {
        
    }
}