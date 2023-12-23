import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputOil {
    public static void main(String[] args)  {
        PrintWriter fileout = null;
        try {
            fileout = new PrintWriter("./shanmengqi/receipt.txt");
        } catch (FileNotFoundException e) {
            System.out.println("error output!");
            throw new RuntimeException(e);
        }

        System.out.println("gas costs $ 1.959 per gallon.");

        fileout.println("gas costs $ 1.959 per gallon.");

        Scanner scan = new Scanner(System.in);
        System.out.print("How many gallons do you want?");
        double amount = Double.parseDouble(scan.nextLine());

        fileout.println("How many gallons do you want? "+amount);

        double totalCost = amount * 1.959;

        System.out.println("Total cost: $ "+totalCost);
        fileout.println("Total cost: $ "+totalCost);



        fileout.close();
        System.out.println("Writing customized receipt to 'receipt.txt'... done.");


    }
}
