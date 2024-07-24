package APIs;

public class StringDemo3 {
    public static void main(String[] args) {

        // 2、只要是以双引号给出的字符串对象，存储在常量池中，而内容相同时只存储一份

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        // 3、new String创建字符串对象，每次new出来的都是一个新对象，放在堆内存中
        char[] chars = {'a', 'b', 'c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);


    }
}
