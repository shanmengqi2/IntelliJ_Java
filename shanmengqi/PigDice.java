import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        int ppots = 0;
        int cpots = 0;
        int thisRound=0;
        System.out.println("Welcome to PigDice, enjoy your game!");
        System.out.println("You will roll first.");
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        //boolean isPlayersRound = true;
        boolean isComputerRound = true;
        while(flag){
            while(true){
                System.out.println("It's players round!");
                int temp = PlayerRoll();

                thisRound = thisRound+temp;
                System.out.println("Player rolls "+thisRound+" in this round");
                ppots = ppots+thisRound;
                System.out.println("Player has so far "+ppots+" points in total game;");

                if(temp == 1){
                    System.out.println("Player rolls 1, round ends.");
                    thisRound = 0;
                    //isPlayersRound = false;
                    //isComputerRound = true;
                    break;
                }
                else{

                    System.out.println("Continue or hold?(c/h)");
                    String isGoingOn = scan.nextLine();
                    if(isGoingOn.equals("c")){

                        System.out.println("Player continue!");
                        //continue;

                    }
                    else if(isGoingOn.equals("h")){
                        System.out.println("Player round ends, got "+ppots+" total");
                        //isPlayersRound = false;
                        break;
                    }
                }

                if(ppots >= 100){
                    System.out.println("Player wins!");
                    flag = false;
                    isComputerRound = false;
                    break;
                }



            }

            if (isComputerRound){
                System.out.println("It's AI'S round.");
                cpots = cpots+ComRoll();
                if(cpots>=100){
                    System.out.println("AI WINS!");
                   // isPlayersRound = false;
                    flag = false;

                }
            }

        }

    }

    public static int ComRoll(){
        boolean flag = true;
        int cpots = 0;
       // int total = 0;
        int roll=0;
        while(flag){
            roll = 1+ (int)(Math.random()*6);
            System.out.println("AI ROLLS: "+roll);
            if(roll == 1){
                flag = false;
                System.out.println("AI ROLLS: 1");
                cpots = 0;
            }
            else {
                cpots = cpots+roll;
                if(cpots<20){
                    System.out.println("AI has "+cpots+" so far this round");
                    System.out.println("AI WILL ROOL AGAIN");

                }
                else {
                    flag = false;
                }
               // total = total+cpots;
            }
        }

        System.out.println("AI GOT: "+cpots+"points this turn");
        return roll;
    }

    public static int PlayerRoll(){
        //System.out.println("This round ends, Player got: "+ppots+" points.");
        int temp = 1+ (int)(Math.random()*6);
        System.out.println("Player rolls: "+ temp);
        return temp;

    }
}