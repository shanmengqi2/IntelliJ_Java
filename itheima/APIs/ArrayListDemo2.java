package APIs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        /*
        需求：
        现在假如购物车中存储了如下这些商品：Java入门，宁夏枸杞，黑枸杞，人字拖，特级枸杞，枸杞子。现在用户不想买枸杞了，选择了批量删除，请完成该需求
         */

        ArrayList<String> shopList = new ArrayList<String>();
        shopList.add("Java入门");
        shopList.add("宁夏枸杞");
        shopList.add("黑枸杞");
        shopList.add("人字拖");
        shopList.add("特级枸杞");
        shopList.add("枸杞子");
        System.out.println(shopList);

//        for (String merchants : shopList) {
//            if(merchants.contains("枸杞")){
//                shopList.remove(merchants);
//            }
//        }

        Iterator<String> iterator = shopList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item.contains("枸杞")){
                iterator.remove();
            }
        }

        System.out.println(shopList);


    }
}
