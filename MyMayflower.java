import mayflower.*;

public class MyMayflower extends Mayflower 
{
    //Constructor
    public MyMayflower()
    {
        //Create a window with 850x500 resolution
        super("Mayflower Project", 850, 500);
    }

    public void init()
    {
        Mayflower.setFullScreen(true);
        World titlescreen=  new Title();
        World level1=  new Level1();
        World level2=  new Level2();
        Mayflower.setWorld(titlescreen);
    }
}
