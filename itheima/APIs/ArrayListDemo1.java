package APIs;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1、创建一个ArrayList的集合对象
        ArrayList list = new ArrayList();
        list.add("黑马");
        list.add(666);
        list.add(99.5);
        list.add("黑马");
        list.add("Java");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList();
        list1.add("黑马");
        list1.add("黑马");
        list1.add("Java");

        System.out.println(list1);

        // 2、往集合中的某个索引位置处添加一个数据
        list1.add(1,"MySql");
        System.out.println(list1);

        // 3、根据索引获取集合中某个索引位置处的值
        String rs = list1.get(1);
        System.out.println(rs);

        // 4、获取集合的大小（返回集合中存储的元素个数）
        System.out.println(list1.size());

        // 5、根据索引删除集合中的某个元素值，会返回被删除的元素值给我们
        System.out.println(list1.remove(1));
        System.out.println(list1);

        // 6、直接删除某个元素值，删除成功
        //list1.remove("Java");

        list1.add(1,"html");
        list1.remove("黑马");  //默认删除的是第一次出现的黑马的数据的
        System.out.println(list1);

        // 7、修改某个索引位置处的数据，修改后会返回原来的值给我们
        System.out.println(list1.set(1, "黑马程序员"));
        System.out.println(list1);




    }
}
