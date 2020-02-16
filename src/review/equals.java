package review;

public class equals {
    //equals 和 == 的区别

    /***equlas源码
     *     public boolean equals(Object anObject) {
     *         if (this == anObject) {   直接用==判断，是否是同一个Object对象
     *             return true;
     *         }
     *         if (anObject instanceof String) {
     *             String anotherString = (String)anObject;
     *             int n = value.length;
     *             if (n == anotherString.value.length) {
     *                 char v1[] = value;
     *                 char v2[] = anotherString.value;
     *                 int i = 0;
     *                 while (n-- != 0) {
     *                     if (v1[i] != v2[i])
     *                         return false;
     *                     i++;
     *                 }
     *                 return true;
     *             }
     *         }
     *         return false;
     *     }
     *
     *     初步理解：
     *        ==是判断两个变量或实例是不是指向同一个内存空间，equals是判断两个变量或实例所指向的内存空间的值是不是相同
     *       ==是指对内存地址进行比较 ， equals()是对字符串的内容进行比较
     *       ==指引用是否相同， equals()指的是值是否相同
     *     深入理解：
     *      == 比较的是变量(栈)内存中存放的对象的(堆)内存地址，用来判断两个对象的地址是否相同，
     *      即是否是指相同一个对象。比较的是真正意义上的指针操作
     *      equals用来比较的是两个对象的内容是否相等，由于所有的类都是继承自java.lang.Object类的，
     *      所以适用于所有对象，如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，
     *      而Object中的equals方法返回的却是==的判断。
     *      String s="abc"是一种非常特殊的形式,和new 有本质的区别。
     *      它是java中唯一不需要new 就可以产生对象的途径。
     *      以String s="abc";形式赋值在java中叫直接量,它是在常量池中而不是象new一样放在压缩堆中。
     *       这种形式的字符串，在JVM内部发生字符串拘留，即当声明这样的一个字符串后，
     *      JVM会在常量池中先查找有有没有一个值为"abc"的对象,
     *      如果有,就会把它赋给当前引用.即原来那个引用和现在这个引用指点向了同一对象, 
     *      如果没有,则在常量池中新创建一个"abc",
     *      下一次如果有String s1 = "abc";
     *      又会将s1指向"abc"这个对象,即以这形式声明的字符串,只要值相等,任何多个引用都指向同一对象.
     *
     *
     */
    public static void main(String[] args) {
        long a = Math.round(-0.5);
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str1==str2);                         //true      地址相同
        System.out.println(str1.equals(str2));                 //true      值相同
        System.out.println(str1==str3);                       //false     地址不相同
        System.out.println(str1.equals(str3));               //true      值相同
        System.out.println(str3==str4);                     //false     地址不相同
        System.out.println(str3.equals(str4));             //true      值相同
    }

}
