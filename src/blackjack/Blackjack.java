package blackjack;

import java.util.Scanner;

public class Blackjack {

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        int money = 100;
        boolean keepPlaying = true;

        System.out.println("Welcome to the Blackjack table!");

        while (true) {
            System.out.println("\nYou have $" + money);
            System.out.println("How much to bet? (0 to quit): ");
            int bet = scanner.nextInt();

            if (bet == 0)
                break;

            if (bet > money) {
                System.out.println("You can't bet more than you have!");
                continue;
            }

            boolean userWon = playRound(scanner);

            if (userWon)
                money = money + bet;
            else
                money = money - bet;

            if (money == 0) {
                System.out.println("You are broke! Game over!");
                break;
            }
            }

        System.out.println("You leave with $" + money);
    }

    static boolean playRound(Scanner scanner) {
    Deck deck = new Deck();
    deck.shuffle();

    Hand dealerHand = new Hand();
    Hand playerHand = new Hand();

    dealerHand.addCard(deck.dealCard());
    dealerHand.addCard(deck.dealCard());
    playerHand.addCard(deck.dealCard());
    playerHand.addCard(deck.dealCard());

    // The "Hit" loop for the player
        while (true) {
            System.out.println("Your cards: " + playerHand.getBlackjackValue() + "points");
            System.out.println("Dealer is showing a " + dealerHand.getCard(0));
            System.out.println("Hit (H) or Stand (S)?");
            String action = scanner.next();

            if (action.equalsIgnoreCase("S"))
                break;
            else if (action.equalsIgnoreCase("H")) {
                playerHand.addCard(deck.dealCard());
                if (playerHand.getBlackjackValue()>21) {
                    System.out.println("Oof! You have " + playerHand.getBlackjackValue());
                    return false;
                }
            }
        }

        System.out.println("Dealer's cards " + dealerHand.getBlackjackValue());
        while (dealerHand.getBlackjackValue() < 17) {
            dealerHand.addCard(deck.dealCard());
            System.out.println("Dealer hits: " + dealerHand.getBlackjackValue());
        }

        if (dealerHand.getBlackjackValue()> 21) {
            System.out.println("Dealer busts! You win.");
            return true;
        }

        return playerHand.getBlackjackValue() > dealerHand.getBlackjackValue();
        }
        }
