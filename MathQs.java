 

/**
 * Write a description of class HardMath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathQs
{
    int lives = 3;
    int que = 5;

    public static void main (String args[])
    {
        new MathQs();
    }

    public MathQs()
    {
    }

    public void EasyMath()
    {
        // question 1

        int age = lowrandom();//geting aliensA's original age
        int older = lowrandom();//getting how many times older alienB was
        int cage = highrandom();// getting aliensA's current age

        int ansa = IBIO.inputInt("When alienA was " +age+" years old, alienB was " +older+" times older.If alienA is now " +cage+"years old, how old is alienB?");
        delay();
        if( ansa == (((age*older)-older) + cage))
        {
            que--;
            System.out.println("\nFanatastic job! ");
            System.out.println("You have " + lives + " lives left");
            System.out.println("There are " +que+ " questions");

        
        }
        else {
                    que--;
                    lives--;
                    System.out.println(" Wrong Answer :( ");
                    System.out.println(" The right answer was " + (((age*older)-older) + cage));
                }
                
        //--------------------------------------------------------------------------------------------------
        
        // question 2
        
        int aliens = highrandom();
        
        int ansb = IBIO.inputInt(" If there are " +aliens+" in a room and they double every minute, how many aliens will be there after 3 minutes?");
        if( ansb == (aliens*2*2*2))
        {
            que--;
            System.out.println("\nFanatastic job! ");
            System.out.println("You have " + lives + " lives left");
            System.out.println("There are " +que+ " questions");

        
        }
        else {
                    que--;
                    lives--;
                    System.out.println(" Wrong Answer :( ");
                    System.out.println(" The right answer was " + (aliens*2*2*2));
                }
        
       //--------------------------------------------------------------------------------------------------
        
        // question 3
        int numa = lowrandom();
        int numb = lowrandom();
        int numc = lowrandom();
        
        int ansc= IBIO.inputInt("There are aliens numbered from 100-999, how many of those have a number formed of the digits " +numa+""+numb+""+numc+"");
        
        
       
        
        
    }

    public void HardMath()
    {

        {
            while( lives>0)
            {
                int x = lowrandom();
                int y = highrandom();

                //question 6
                int ansa = IBIO.inputInt("\nIf the alien is " + x+ "m taller and a diagnol from his eye level to your level is " + y+ "m , then how far is the alien( to the nearest meter )? ");
                delay();
                if( ansa == pythagorean( x,y))
                {
                    que--;
                    System.out.println("\nFanatastic job! ");
                    System.out.println("You have " + lives + " lives left");
                    System.out.println("There are " +que+ " questions");
                }
                else {
                    que--;
                    lives--;
                    System.out.println(" Wrong Answer :( ");
                    System.out.println(" The right answer was " + pythagorean(x,y));
                }

                //-------------------------------------------------------------------

                // question 7

                int a = lowrandom();
                int b = highrandom();

                int ansb = IBIO.inputInt("\nIf there are " +a+" aliens in the first room and you have " +b+ " bullets in your mag, how what is the average amount of bullets you should expend per alien (to the nearest bullet) ?");
                delay();
                if( ansb == division(b,a))
                {
                    que--;
                    System.out.println("\nFanatastic job! ");
                    System.out.println("You have " + lives + " lives left");
                    System.out.println("There are " +que+ " questions");
                }
                else {
                    que--;
                    lives--;
                    System.out.println("\n Wrong Answer :( ");
                    System.out.println("The right answer was " +division(a,b));
                }

                //-----------------------------------------------------------------

                //question 8

                int c = lowrandom();
                int ansc = IBIO.inputInt("\nIf there were " +a+" aliens in the first room and " + (a+c)+ " aliens in the second room, then how many aliens should be in the third room ?");
                delay();
                if( ansc == (a+c+c))
                {
                    que--;
                    System.out.println("\nFanatastic job! ");
                    System.out.println("You have " + lives + " lives left");
                    System.out.println("There are " +que+ " questions");
                }
                else {
                    que--;
                    lives--;
                    System.out.println("\n Wrong Answer :( ");
                    System.out.println("The right answer was " +(a+c+c));
                }

                //-------------------------------------------------------------------

                //question 9

                int d = lowrandom();
                int alienstotal = (3*a)+(3*c);
                int third = (a+c+c);
                for ( int i = 0; i<d; i++)
                {
                    third +=c;
                    alienstotal = alienstotal + third;
                }

                int ansd = IBIO.inputInt("\nIf there were " +alienstotal+ " aliens to begin with, how many aliens are left after 3 rooms? ");
                delay();
                if( ansd == (alienstotal - ((3*a)+(3*c)) ))
                {
                    que--;
                    System.out.println("\nFanatastic job! ");
                    System.out.println("You have " + lives + " lives left");
                    System.out.println("There are " +que+ " questions");
                }
                else {
                    que--;
                    lives--;
                    System.out.println("\n Wrong Answer :( ");
                    System.out.println("The right answer was " +(alienstotal - ((3*a)+(3*c))));
                }

                //-------------------------------------------------------------------
                // question 10

                int anse = IBIO.inputInt("\nGiven that there are " +(alienstotal - ((3*a)+(3*c)))+ " aliens left, how many rooms of aliens are left?");
                delay();
                if( anse == d)
                {
                    que--;
                    System.out.println("\nFanatastic job! ");
                    System.out.println("You have " + lives + " lives left");
                    System.out.println("There are " +que+ " questions");
                }
                else {
                    que--;
                    lives--;
                    System.out.println("\n Wrong Answer :( ");
                    System.out.println("The right answer was " +(d));
                }

            }
        }
    }

    public int lowrandom()
    {
        int random = (int)((Math.random()*9)+1);
        return random;

    }

    public int highrandom()
    {
        int random = (int)((Math.random()*40)+11);
        return random;

    }

    public int pythagorean( int x , int y)
    {
        int xsq = (int) (Math.pow(x,2));
        int ysq = (int) (Math.pow(y,2));
        int ans = (int)(Math.round(Math.sqrt((ysq-xsq))));
        return ans;

    }

    public int division ( int n, int d)
    {
        int ans = (int)(n/d);
        return ans;

    }

    public void delay()
    {
        try
        {
            Thread.sleep (1200);
        }
        catch (InterruptedException m)
        {
            ;
        }
    }
}