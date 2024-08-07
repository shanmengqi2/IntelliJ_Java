package APIs;

public class ItheimaString {
    public static void main(String[] args) {
        String s ="黑马Java";
        //1、获取字符串的长度
        System.out.println(s.length());

        //2、提取字符串中某个索引位置处的字符
        char c = s.charAt(1);
        System.out.println(c);

        //字符串遍历
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        //3、把字符串转换成字符数组，再进行遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 4、判断字符串内容，内容一样就返回true
        String s1 = new String("黑马");
        String s2 = new String("黑马");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        // 5、忽略大小写比较字符串内容
        String c1 = "34AeFG";
        String c2 = "34aEfg";
        System.out.println(c1.equals(c2));  //false
        System.out.println(c1.equalsIgnoreCase(c2));  //true

        // 6、截取字符串内容（包前不包后）
        String s3 = "Java是最好的编程语言之一";
        System.out.println(s3.substring(0,8));

        // 7、从当前索引位置一直截取到字符串的末尾
        System.out.println(s3.substring(5));

        // 8、把字符串中的某个内容替换成新内容，并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾，垃圾电影！！";
        String rs3 = info.replace("垃圾","**");
        System.out.println(rs3);

        // 9、判断字符串中是否包含某个关键字
        String info2 = "Java是最好的编程语言之一，我爱Java，Java不爱我！";
        System.out.println(info2.contains("Java"));

        // 10、判断字符串是否以某个字符串开头
        String rs4 = "张三丰";
        System.out.println(rs4.startsWith("张"));

        // 11、把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String rs5 = "张无忌，周芷若，殷素素，赵敏";
        String[] name = rs5.split("，");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }





    }
}
