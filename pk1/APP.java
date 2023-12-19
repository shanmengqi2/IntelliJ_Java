public class APP {
    public static void main(String[] args) {
        intSumDigits(27750);
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
}
