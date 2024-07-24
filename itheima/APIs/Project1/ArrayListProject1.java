package APIs.Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendor v = new Vendor();

        do {
            System.out.println("欢迎来到商家菜品管理系统：");
            System.out.println("批量增加菜品请输入1");
            System.out.println("显示菜品列表请输入2");
            System.out.println("添加单个菜品请输入3");
            System.out.println("退出系统请输入exit");

            String input = scanner.nextLine();
            switch (input) {
                case "exit" -> System.exit(0);
                case "1" -> v.addDishMuliple();
                case "2" -> {
                    ArrayList<String> getList = v.getDishList();

                    for (String s : getList) {
                        String[] namePrice = s.split(",");
                        System.out.println(namePrice[0] + " " + namePrice[1] + " 元");
                    }
                }
                case "3" -> {
                    Dish d = new Dish();
                    System.out.println("请输入菜品名称和价格，用，隔开");
                    String setNamePrice = scanner.nextLine();
                    d.setDishName(setNamePrice.split("，")[0]);
                    d.setDishPrice(Double.parseDouble(setNamePrice.split("，")[1]));

                    v.addDish(d);
                }
            }
        }
        while (true);

    }
}
