package Ming.SORT;

public class Student implements Comparable<Student> {
	//此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。

    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    // 定义Student的compareTo函数
    // 如果分数相等，则按照名字的字母序排序
    // 如果分数不等，则分数高的靠前
    @Override
    public int compareTo(Student that) {

        if( this.score < that.score )
            return -1;
        else if( this.score > that.score )
            return 1;
        else // this.score == that.score
            return this.name.compareTo(that.name);
    }

    // 定义Student实例的打印输出方式
    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString( this.score );
    }
}
