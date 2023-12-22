import java.util.Scanner;

public class PigDiceDemo {
    public static void main(String[] args) {
        int cpoint = 0, ppoint = 0, roll = 0, thisTurn;
        Scanner scan = new Scanner(System.in);
        String choice;
        while (cpoint < 100 && ppoint < 100) {
            thisTurn = 0;
            choice = "c";

            //Player round
            while (roll != 1 && choice.equals("c")) {
                roll = 1 + (int) (Math.random() * 6);
                System.out.println("You rolled " + roll);
                if (roll == 1) {
                    thisTurn = 0;
                    System.out.println("round ends");
                } else {
                    thisTurn += roll;
                    System.out.println("You have got " + thisTurn + " points this round");
                    System.out.println("continue or hold?(c/h)");
                    choice = scan.nextLine();
                }
            }
            ppoint = ppoint + thisTurn;
            System.out.println("You have " + ppoint + " so far in this game.");

            //Computer Round
            if (ppoint < 100) {
                thisTurn = 0;
                roll = 0;
                while (thisTurn < 20 && roll != 1) {

                    roll = 1 + (int) (Math.random() * 6);
                    System.out.println("AI ROLLED A " + roll);
                    if (roll == 1) {
                        thisTurn = 0;
                    } else {
                        thisTurn = thisTurn + roll;
                        System.out.println("AI HAS ROLLED " + thisTurn + " so far this round");
                    }
                    if (thisTurn < 20) {
                        System.out.println("AI WILL ROLL AGAIN.");
                    }

                }
                cpoint = cpoint + thisTurn;

            }


        }

        if (cpoint > ppoint) {
            System.out.println("AI WINS");
        } else {
            System.out.println("Player wins");
        }
    }
}
