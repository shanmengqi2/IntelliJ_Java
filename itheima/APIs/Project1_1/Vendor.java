package APIs.Project1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendor {
    private ArrayList<Dish> dishList = new ArrayList<>();

    public Vendor() {

    }

    public ArrayList<Dish> addDish() {
        while (true){
            Scanner sc = new Scanner(System.in);
            Dish d = new Dish();
            System.out.println("请输入菜品名：");
            d.setDishName(sc.nextLine());
            System.out.println("请输入菜品价格：");
            d.setDishPrice(Double.parseDouble(sc.nextLine()));
            //v.addDish(d);
            this.dishList.add(d);
            System.out.println("是否继续添加？（n退出，其它任意键继续）");
            String s = sc.nextLine();
            if (s.toLowerCase().equals("n")){
                break;
            }
        }

        return dishList;
    }

    public ArrayList<Dish> getDishList() {
        return dishList;
    }

}
