public class APP {
    public static void main(String[] args) {
        calcNNN(5);
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
     //   int[] number = {1,2,3,4};
      //  System.out.println(number[0]);
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


}
