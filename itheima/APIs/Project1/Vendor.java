package APIs.Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendor {

    protected ArrayList<String> dishList = new ArrayList<>();

    public void addDish(Dish dish) {
        dishList.add(dish.getDishName()+","+dish.getDishPrice());
    }

    public ArrayList<String> getDishList() {

        return dishList;
    }

    public ArrayList<String> addDishMuliple() {
        System.out.println("请输入菜品名和价格，用，隔开;停止录入请输入exit");
        Scanner scanner = new Scanner(System.in);
        //ArrayList<String> dishList = new ArrayList<>();
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("exit")) {
                System.out.println("停止录入");
                break;
            }
            else{
                try {
                    String dishName = str.split("，")[0];
                    String dishPrice = str.split("，")[1];
                    this.dishList.add(dishName+","+dishPrice);
                }
                catch(Exception e) {
                    System.out.println("输入有误，请按照格式要求输入");
                    e.printStackTrace();
                }

            }


        }
        return dishList;

    }
}
