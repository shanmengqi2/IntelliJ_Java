import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        int ppots = 0;  //玩家总分
        int cpots = 0;  //AI总分
        int thisRound=0; //玩家一轮得分（骰出1或选择hold前为一轮）
        int lastTotal; //一轮游戏开始时，玩家的总分
        System.out.println("Welcome to PigDice, enjoy your game!");
        System.out.println("You will roll first.");
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        //boolean isPlayersRound = true;
        boolean isComputerRound = true;
        while(flag){
            thisRound = 0;
            lastTotal = ppots;
            while(true){

                System.out.println("It's players round!");
                int temp = PlayerRoll(); //temp为玩家每次rollDice时的数值

                if(temp == 1){
                    System.out.println("Player rolls 1, round ends.");
                    thisRound = 0;
                    ppots = lastTotal;
                    break;
                }
                else{
                    thisRound = thisRound+temp;  //thisRound仅为展示，不参与总分ppots计算
                    System.out.println("Player rolls "+thisRound+" in this round");
                    ppots = ppots+temp;  //游戏总分计算累加要用temp，这里我一开始写了thisRound，产生了重复计算。

                    //ceshidian
                    //System.out.println("ppots after add:"+ppots);

                    if(ppots >= 100){
                        System.out.println("Player wins!");
                        flag = false;
                        isComputerRound = false;
                        break;
                    }

                    System.out.println("Continue or hold?(c/h)");
                    String isGoingOn = scan.nextLine();
                    if(isGoingOn.equals("c")){

                        System.out.println("Player continue!");
                        //continue;

                    }
                    else if(isGoingOn.equals("h")){
                        System.out.println("Player round ends, got "+thisRound+" total");
                        //isPlayersRound = false;
                        break;
                    }
                }

            }


            System.out.println("Player has so far "+ppots+" points in total game;");


            if (isComputerRound){
                System.out.println("It's AI'S round.");
                cpots = cpots+ComRoll();
                System.out.println("AI HAS "+cpots+" in total game");
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
        return cpots;
    }

    public static int PlayerRoll(){
        //System.out.println("This round ends, Player got: "+ppots+" points.");
        int temp = 1+ (int)(Math.random()*6);
        System.out.println("Player rolls: "+ temp);
        return temp;

    }
}
