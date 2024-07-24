package APIs.Project1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vendor v = new Vendor();
        while (true){
            System.out.println("欢迎来到商家菜品管理系统：");
            System.out.println("批量增加菜品请输入1");
            System.out.println("显示菜品列表请输入2");
            //System.out.println("添加单个菜品请输入3");
            System.out.println("退出系统请输入exit");
            String input = sc.nextLine();

            switch (input.toLowerCase()){
                case "1":{
                    v.addDish();
                    break;
                }
                case "2":{
                    ArrayList<Dish> dishList = v.getDishList();
                    for (Dish d : dishList){
                        System.out.println(d.getDishName()+" "+d.getDishPrice()+"元");
                    }
                    break;
                }
                case "exit":{
                    System.exit(0);
                    //break;
                }
                default:break;
            }
        }


    }
}
