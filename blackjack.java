 

/**
 * Write a description of class blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class blackjack
{
    //instance variables to keep track of score
    int playerScore = 0;
    int dealerScore = 0;
    //first two cards the player and dealer are given
    int playerCards = 2;
    int dealerCards = 2;

    public static void main(String args[]){
        new blackjack ();
    }

    public blackjack(){

        instructions();
        char play = IBIO.inputChar("\n Are you ready to begin? (y/n) ");
        while( play == 'n' || play == 'N')
        {
            play = IBIO.inputChar(" \nAre you ready to begin now ? (y/n) ");
        }

        while ( play == 'y' || play == 'Y')
        {
            //drawing first two cards , add it too the player score,
            int playercard1=  (int) ((Math.random()*9)+2);
            int playercard2=  (int) ((Math.random()*9)+2);
            playerScore= playercard1 + playercard2;

            System.out.println("\nYou got a " + cardName(playercard1) + ".");
            System.out.println("You also got a " + cardName(playercard2) + ".");
            System.out.println("Your score is: " + playerScore);
            System.out.println();

            //player winning test
            if (playerScore == 21) {
                System.out.println("You won!");
                play = 'n';
            } else {

                //testing score cap as well as exiting loop condition
                char anothercard = IBIO.inputChar("Do you want to pick up another card (max 5 cards)? (y/n) "); // moving towards exiting loop condition
                while ((anothercard == 'y' || anothercard == 'Y') && playerCards < 5 && playerScore <= 21){
                    int newcardval =  (int) ((Math.random()*9)+2);
                    System.out.println("\nYou picked up a " + cardName(newcardval) + ".");
                    playerScore+= newcardval;
                    System.out.println("Your current score is " + playerScore + ".");
                    if(playerScore==21) {
                        delay();
                        System.out.println("\nYou won!");
                        play = 'n';
                    }

                    playerCards++; //adding cards so they cant go over 5 cards

                    if (playerScore > 21) {    
                        //ending game
                        delay();
                        throw new RuntimeException("\nYour score was over 21. You lost the game :( ");

                    } else if (playerCards == 5) {
                        System.out.println("\n You have  picked up the maximum amount of cards! ");// exiting loop
                    }
                    else{
                        anothercard=IBIO.inputChar("\nDo you want to pick up another card (max 5 cards)? (y/n) ");
                    }
                }  

                if( playerScore<21)
                {
                    System.out.println("\nIt's now the dealer's turn.");

                    //drawing first two cards , add it too the dealer score,      
                    int dealercard1=  (int) ((Math.random()*9)+2);
                    int dealercard2=  (int) ((Math.random()*9)+2);
                    dealerScore= playercard1 + playercard2;
                    System.out.println("The dealer drew a " + cardName(dealercard1) + ".");
                    System.out.println("The dealer also drew a " + cardName(dealercard2) + ".");
                    System.out.println("The dealer's current score is : " + dealerScore);
                    System.out.println();

                    //Testing if dealer has won
                    if (dealerScore == 21) {
                        delay();
                        throw new RuntimeException("\nThe dealer won!");
                    } else  {

                        //dealers losing and exiting while loop condition
                        while (dealerCards < 5 && dealerScore < 16) {
                            int newcardvalb =  (int) ((Math.random()*9)+1);        
                            System.out.println("\nThe dealer drew a " + cardName(newcardvalb) + ".");
                            dealerScore+= newcardvalb;
                            System.out.println("The dealer's score is now " + dealerScore + ".");
                            System.out.println();

                            dealerCards++; //moving towards maximum 5 cards

                            if (dealerScore > 21) {
                                //ending the game and quitting the program
                                delay();
                                System.out.println("\nThe dealer's score was over 21. You win ");
                            } else if (dealerCards == 5) {
                                System.out.println("\nThe dealer picked up the maximum amount of cards.");
                            }

                        }
                        delay();
                    }
                }

                if (dealerScore<21&&playerScore<21){
                    if (playerScore == dealerScore) {
                        System.out.println("\nYou drew with the dealer. Boring!");
                        System.out.println("\n Time for a rematch!");

                    } else if (dealerScore > playerScore) {
                        throw new RuntimeException ("\nYou have suffered defeat at the hand of the dealer.");

                    } else {
                        System.out.println("\nCongratulations! You have beaten the dealer.");
                        play = 'n';
                    }

                }
            }
        }
    }

    //assigning names to numerical card values
    public static String cardName(int number){
        String name = "";
        if (number == 2) {
            name = "Two";
        } else if (number == 3) {
            name = "Three";
        } else if (number == 4) {
            name = "Four";
        } else if (number == 5) {
            name = "Five";
        } else if (number == 6) {
            name = "Six";
        } else if (number == 7) {
            name = "Seven";
        } else if (number == 8) {
            name = "Eight";
        } else if (number == 9) {
            name = "Nine";
        } else if (number == 11) {
            name = "Ace";
        } else  {
            int facecard = (int) ((Math.random()*3)+1);
            if (facecard == 1) {
                name = "Jack";
            } else if (facecard == 2) {
                name = "Queen";
            } else {
                name = "King";
            }   
        }
        return name;

    }

    public void instructions()
    {
        System.out.println(" \nWelcome to BLACKJACK ");
        System.out.println(" \nThe instructions are listed below :");
        System.out.println(" \nBoth you and the dealer will be given two cards");
        System.out.println(" \nThe numbers on the cards will be added to create you score");
        System.out.println(" \nIf your score is 21 , YOU AUTOMATICALLY WIN :)");
        System.out.println(" \nOtherwise you can choose to pick up another card,upto a MAXIMUM of 5 cards");
        System.out.println(" \nBe wise with your decisions , as if you reach a score over 21, YOU AUTOMATICALLY LOSE :(");
        System.out.println(" \nOnce you are done picking cards,");
        System.out.println(" \nThe dealer will pick up cards till they reach a score of 16 or more");
        System.out.println(" \nThe same winning and losing conditions apply to the dealer");
        System.out.println(" \nAt the end the person with the higher score wins!!!");

    }

    public void delay()
    {
        try
        {
            Thread.sleep (3000);
        }
        catch (InterruptedException m)
        {
            ;
        }
    }
}

