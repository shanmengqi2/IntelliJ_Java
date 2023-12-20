import java.util.ArrayList;

public class BasicAPP {
    public static void main(String[] args) {
        numberInRange(5,20,3);
    }

    //19. integer to binary
    public static void initegerToBinary(int temp) {

        ArrayList<Integer> output = new ArrayList<Integer>();

        while(temp !=0) {
            output.add(temp % 2);
            temp = temp / 2;
            //count ++;
        }

        for(int i=output.size()-1;i>=0;i--) {
            System.out.print(output.get(i));
        }



    }
    //22. Write a Java program to convert a binary number to a decimal number.
    public static void binaryToDecimal(int temp) {
        long decimal=0;
        int count = 0;
        while(temp !=0) {
            decimal = decimal+(long) ((temp % 10)*(Math.pow(2, count)));
            temp = temp / 10;
            count++;
        }

        System.out.println(decimal);
    }




    //33. Write a Java program and compute the sum of an integer's digits.
    public static void intSumDigits(int temp){
        int sum = 0;
        while(temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        System.out.println(sum);


    }
    //37. Write a Java program to reverse a string.
    //Input Data:
    //Input a string: The quick brown fox
    //Expected Output
    //Reverse string: xof nworb kciuq ehT

    public static void reverseString(String str){
        char[] letters = str.toCharArray();

        for(int i=letters.length-1;i>-1;i--){
            System.out.print(letters[i]);
        }
    }

    //39. Write a Java program to create and display a unique three-digit number
    //using 1, 2, 3, 4. Also count how many three-digit numbers are there.
    //Expected Output
    //123
    //124
    //...
    //
    //431
    //432
    //Total number of the three-digit-number is 24
    public static void threeDigit(){

        int count = 0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                for(int k=1;k<5;k++){
                    if(i!=j && j!=k && i!=k){
                        System.out.println(i+""+j+k+"\n");
                        count++;



                    }
                }
            }

        }
        System.out.println("Total number of the three-digit-number is "+count);
    }

    //44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
    //Sample Output:
    //
    //Input number: 5
    //5 + 55  + 555

    public static void calcNNN(int n){
        int sum = n+ 10*n+n + 100*n+10*n+n;
        System.out.println(sum);
    }

    //50. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
    //Sample Output:
    //
    //Divided by 3:
    //3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
    //, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
    //
    //Divided by 5:
    //5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
    //95,
    //
    //Divided by 3 & 5:
    //15, 30, 45, 60, 75, 90,

    public static void pro50(){
        int[] byThree = new int[50];
        int[] byFive = new int[50];
        int[] byThreeFive = new int[50];
        int count1 = 0, count2=0,count3=0;
        for(int i=1;i<101;i++){
            if(i % 3 ==0){
                byThree[count1] = i;
                count1++;
                if(i % 5 ==0){
                    byThreeFive[count2] = i;
                    byFive[count3] = i;
                    count2++;
                    count3++;
                }
            }
            else if (i % 5 ==0) {
                byFive[count3] = i;
                count3 ++;
            }

            }


        //print by 3
        System.out.println("Divided by 3:");

        for (int i=0;i<count1;i++){
            System.out.print(byThree[i]+", ");
        }
        System.out.println();

        //print by 5
        System.out.println("Divided by 5:");
        for (int i=0;i<count3;i++){
            System.out.print(byFive[i]+", ");
        }
        System.out.println();

        //print by 3/5
        System.out.println("Divided by 3/5:");
        for(int i=0;i<count2;i++){
            System.out.print(byThreeFive[i]+", ");
        }



    }


    //55. Write a Java program to convert seconds to hours, minutes and seconds.
    //    Sample Output:
    //
    //Input seconds: 86399
    //23:59:59
    public static void secondsToTime(int seconds){
        int hour = seconds / 3600;
        int minute = (seconds - 3600*hour) / 60;
        int second = (seconds - 3600*hour) % 60;

        System.out.println(hour+":"+minute+":"+second);
    }

    //56. Write a Java program to find the number of values in a given range divisible by a given value.
    //For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
    //Sample Output:
    //
    //5
    public static void numberInRange(int x,int y,int p){
        int count=0;
        for(int i=x;i<y;i++){
            if(i % p == 0){
                count++;
            }
        }

        System.out.println(count);
    }


}



