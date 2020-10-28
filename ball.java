 

/**
 * Write a description of class ball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ball
{
    public static void main (String args[])
    {
        new ball ();
    }

    /**
     * Constructor for objects of class ball
     */
    public ball()
    {
        System.out.println("\nRing Ring, Ring Ring..");
        System.out.println("\nAgent K : Agent K speaking , who is this?");
        System.out.println("You : Agent J speaking, I had a question I wanted to ask."); 

        IBIO.inputString("What is your question J?(ask for a weapon upgrade) : ");

        int num = (int) (Math.random () *13) +1;
        
        delay();
        if (num == 1)
            System.out.println("\nAgent K : Outlook not so good. ");
        else if (num == 2)
            System.out.println("\nAgent K : Don't count on it. ");
        else if (num == 3)
            System.out.println("\nAgent K : My sources say no. ");
        else if (num ==4)
            System.out.println("\nAgent K : Without a doubt. ");
        else if (num == 5)
            System.out.println("\nAgent K : The reply is hazy.  ");
        else if (num == 6)
            System.out.println("\nAgent K : It is certain. ");
        else if (num == 7)
            System.out.println("\nAgent K : My reply is no'");
        else if (num ==8)

            System.out.println("\nAgent K : As I see it yes'");
        else if (num==9)
            System.out.println("\nAgent K : Cannot predict now'");
        else if (num==10)
            System.out.println("\nAgent K : Outlook good'");
        else if (num==11)
            System.out.println("\nAgent K : Better not tell you now'");
        else if (num==12)
            System.out.println("\nAgent K : Very doubtful'");
        else {
            System.out.println("\nAgent K : Yes definitely'");
        }

        if (num == 4 || num == 6 || num == 8 || num == 10 || num == 13)
        {
            
            choose chooseobject = new choose();
            

        }
        else {
            System.out.println("\nUnfortunately, you have been denied an upgrade.");
            
            MathQs MathQsObject = new MathQs();
       
        }
    }

    public void delay()
    {
        try
        {
            Thread.sleep (2000);
        }
        catch (InterruptedException m)
        {
            ;
        }
    }


}   

    