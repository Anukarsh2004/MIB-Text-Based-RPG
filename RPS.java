 


/**
 * Write a description of class RPS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPS
{
    int playerScore = 0;
    int opponentScore = 0;
    int oppnum = 'o';
    char oppweapon = 'o';
    char playerweapon = 'o';

    public static void main (String args[])
    {
        new RPS();
    }

    /**
     * Constructor for objects of class RPS
     */
    public RPS()
    {
        instructions();
        repeat();
    }

    public void instructions()
    {
        System.out.println(" \nWelcome to BOOM POW BLAST");
        System.out.println(" \nThe instructions are simple");
        System.out.println(" \nYou choose one of three weapons, \n Galactus,Trident or Zapatron");
        System.out.println(" \nTrident beats Galactus \nZapatron beats Trident \nAnd Galactus beats Zapatron");
        System.out.println(" \nEach win equals one point");
        System.out.println(" \nFirst to three points wins!!!! ");
    }

    public void repeat()
    {
        if(playerScore == 3) {
            System.out.println("\nCongratulations! You have won the whole game");
        }
        else if ( opponentScore == 3) {
            throw new RuntimeException("\nUnlucky! You have lost the whole game");
        }

        char continu = 'y';
        while( continu == 'y' && playerScore<3 && opponentScore<3)
        {
            playerweapon = IBIO.inputChar("\nWhat weapon do you want, Galactus(g), Trident (t) or Zapatron(z)?");
            {
                continu = cont(playerweapon);
                if( continu == 'n') {
                    System.out.println("\nYou picked the " + wepname(playerweapon));
                    if( wepname(playerweapon) == "Galactus") {
                        delay(1500);
                        drawg();

                    }
                    else if( wepname(playerweapon) == "Trident") {
                        delay(1500);
                        drawt();
                    }
                    else if( wepname(playerweapon) == "Zapatron") {
                        delay(1500);
                        drawz();
                    }
                    else {
                        System.out.println("Error :( \nYou picked an invalid option \n Try again!");

                    }
                    while ( continu == 'n')
                    {
                        oppnum = number();
                        oppweapon = name(oppnum);
                        
                        delay(1500);
                        System.out.println("Your opponent picked the " + wepname(oppweapon));
                        if(wepname(oppweapon) == "Galactus") {
                            delay(1500);
                            drawg();
                        }
                        else if(wepname(oppweapon) == "Trident") {
                            delay(1500);
                            drawt();
                        }
                        else {
                            delay(1500);
                            drawz();
                        }
                        continu = 'y';
                        decision();
                    }

                }
            }
        }
    }

    public void decision()
    {
        delay(3000);
        if( playerweapon == oppweapon) {
            System.out.println("\nYou and your opponent both picked " + wepname(playerweapon));
            System.out.println("Try again");
            repeat();
        }
        else if ( playerweapon == 'g')
        {
            if( oppweapon == 't') {
                System.out.println("\n"+wepname(oppweapon) + " beats " + wepname(playerweapon) + ". You lost the round :(");
                opponentScore ++;
                System.out.println(" You: " + playerScore + "         Opponent: " + opponentScore);
                repeat();
            }
            else  {
                System.out.println("\n"+wepname(playerweapon) + " beats " + wepname(oppweapon) + ". You won the round :)");
                playerScore ++;
                System.out.println(" You: " + playerScore + "         Opponent: " + opponentScore);
                repeat();
            }
        }
        else if ( playerweapon == 't') 
        {
            if( oppweapon == 'z') {
                System.out.println("\n"+wepname(oppweapon) + " beats " + wepname(playerweapon) + ". You lost the round :(");
                opponentScore ++;
                System.out.println(" You: " + playerScore + "         Opponent: " + opponentScore);
                repeat();
            }
            else {
                System.out.println( "\n"+wepname(playerweapon) + " beats " + wepname(oppweapon) + ". You won the round :)");
                playerScore ++;
                System.out.println(" You: " + playerScore + "         Opponent: " + opponentScore);
                repeat();
            }
        }
        else {
            if( oppweapon == 'g') {
                System.out.println( "\n"+wepname(oppweapon) + " beats " + wepname(playerweapon) + ". You lost the round :(");
                opponentScore ++;
                System.out.println(" You: " + playerScore + "         Opponent: " + opponentScore);
                repeat();
            }
            else {
                System.out.println( "\n"+wepname(playerweapon) + " beats " + wepname(oppweapon)+ ". You won the round :)");
                playerScore ++;
                System.out.println(" You: " + playerScore + "         Opponent: " + opponentScore);
                repeat();

            }
        }
    }

    public int number ()
    {
        int number = (int)((Math.random()*3)+1);
        return number;
    }

    public char name (int number)
    {
        char name = 'o';
        if( number == 1)
        {
            name = 'g';
        }
        else if( number == 2) 
        {
            name = 't';
        }
        else
        {
            name = 'z';
        }
        return name;
    }

    public String wepname (char i)
    {
        String wep = "";
        if ( i == 'g') {
            wep = "Galactus";
        }
        else if ( i == 't') {
            wep = "Trident";
        }
        else {
            wep = "Zapatron";
        }

        return wep;
    }

    public char cont (char j)
    {
        char x = 'o';
        if ( j == 'g') {
            x = 'n';
        }
        else if ( j == 't') {
            x = 'n';
        }
        else if ( j == 'z') {
            x = 'n';
        }
        else {
            x = 'y';
        }

        return x;
    }

    public void delay(int a)
    {
        try{
            Thread.sleep(a);
        }
        catch (InterruptedException m){

        }
    }

    public void drawg()
    {
        System.out.println("\n               _____");
        System.out.println("            .':::::::'.");
        System.out.println("       ___ /:::::::::::\\____ _            _.''_");
        System.out.println("    /||   ||`.______.-`||   | |\\_\\\\____/_ _.-'  \\\\\\\\");
        System.out.println(".|-| ||===||           ||===| ||_||||____|_| .-'|||||");
        System.out.println("'|-| ||===||===========||===| ||_||||____|_|`-._|||||");
        System.out.println("    \\||___||___________||___|_|/ ////       `-._////");
        System.out.println("     )      )  _____  (");
        System.out.println("    /`--.._/ .'| (  '. \\");
        System.out.println("    )     ( (  './    ) )");
        System.out.println("   /`--.___\\ '._____.' /");
        System.out.println("   )       /'._______.' LGB");
        System.out.println("  /`--..__/");
        System.out.println(" (        )");
        System.out.println(" `------'");
    }

    public void drawt()
    {
        System.out.println("\n*       *       *");             
        System.out.println("*       *       *");       
        System.out.println("*       *       *");       
        System.out.println("*       *       *");       
        System.out.println("*       *       *");      
        System.out.println("*       *       *");      
        System.out.println("*****************");
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
    }

    public void drawz()
    {
        System.out.println("                                       _____   ___");
        System.out.println("     --[=]-                  [88[  O  ]88888]  o");
        System.out.println("_______|_|              .-.   .-|-===-|------|b|      .o8");
        System.out.println("|         |-------|------| |---| ||o  ||    | |88888888888");
        System.out.println("|_________|-------|______| `---' ||___||    o `~~~~~~~8888");
        System.out.println("`-------|_|-------|HHHHHHHHHHHHHH|-----|~~~________|_|8888");
        System.out.println("      =[_]=                   |++-----+--|  )888  \\__8888");
        System.out.println("                              ||         `==='88b    `888");
        System.out.println("                                              888     `88");
        System.out.println("                                              `88b     `8");
        System.out.println("                                               d88P ");     

    }
}