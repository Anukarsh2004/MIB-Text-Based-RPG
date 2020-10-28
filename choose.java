 

/**
 * Write a description of class choose here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class choose
{
    public static void main ( String atgs[])
    {
        new choose();
    }

    public choose()
    {
        System.out.println("");
        System.out.println("\nWELCOME TO THE MIB WEAPON HEADQUARTERS!");
        System.out.println("\nYou have been granted a weapon upgrade, YAY!");
        System.out.println("\nYou can choose between the Infinity Blade, Galaxy Axe or Annihilator.");
        char choose = IBIO.inputChar("\nWhat weapon do you want to unlock? ");
        System.out.println("\nYou have unlocked the "+weapon(choose));

        if(choose == 'i' || choose == 'I') {

            System.out.println("\n               <>");
            System.out.println("              //");
            System.out.println("             //");
            System.out.println("<>((((({@}::::::::::::::::::::::::======-");
            System.out.println("             \\\\");
            System.out.println("              \\\\");
            System.out.println("               <>");

        }
        else if ( choose == 'g' || choose == 'G') {

            System.out.println("\n  ,:\\      /:.");
            System.out.println(" //  \\_()_/  \\\\");
            System.out.println("||   |    |   ||");
            System.out.println("||   |    |   ||");
            System.out.println("||   |____|   ||");
            System.out.println(" \\\\  / || \\  //");
            System.out.println(" `:/   ||  \\;'");
            System.out.println("       ||");
            System.out.println("       ||");
            System.out.println("       XX");
            System.out.println("       XX");
            System.out.println("       XX");
            System.out.println("       XX");
            System.out.println("       OO");
            System.out.println("       `'");

        }
        else 
        {

            System.out.println("\n            .':::::::'.");
            System.out.println("       ___ /:::::::::::\\____ _         ");
            System.out.println("    /||   ||`.______.-`||   | |\\_\\\\___");
            System.out.println(".|-| ||===||           ||===| ||_||||_|_|");
            System.out.println("'|-| ||===||===========||===| ||_||||_|_|");
            System.out.println("   \\||___||___________||___|_|/ ////    ");
            System.out.println("            )  _____  (");
            System.out.println("           / .'| (  '. \\");
            System.out.println("          ( (  './    ) )");
            System.out.println("           \\ '._____.' /");
            System.out.println("            '._______.' LGB");

        }
    }                                             

    public String weapon(char a)
    {
        String x = "";
        if (a =='i' || a=='I') {
            x = "Infinity Blade";
        }
        if (a =='g' || a=='G') {
            x = "Galaxy Axe";
        }
        if (a =='a' || a=='A') {
            x = "Annihalator";
        }

        return x;

    }
}