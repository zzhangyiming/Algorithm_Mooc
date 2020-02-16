package review.AbstractAndExtends;

public abstract class Weapon  extends Gods implements interfaceGODs{ //可以继承Gods类
//抽象类
    /**
     * abstract 修饰的类为抽象类
     * 抽象类不能实例化，即不能new 一个对象
     *
     *抽象类生来就是为了被继承的，抽象方法 必须被 重写,不被abstract修饰的不用重写
     *
     *
     * 抽象类是神的信仰，只要我信仰了神，神会赐予我他的一部分力量！
     */
    Weapon(){  //抽象类可以有构造器
       System.out.println("上帝：I’m God，只要继承我的信仰和意志，所有物种都可以使用武器，现在去发挥你们的智慧吧！");
    }
    private String str;
    private void claim(){ //私有方法，没有abstract修饰
        if(this.sentence == null){
            System.out.println("神还说了啥？凡人的我听不见");
        }else{
            System.out.println(this.sentence);
            System.out.println(this.name+"：我也是神，你以为我听不到吗？大神棍！！");
        }
    }

    public void announce(){
        claim();
    }
    @Override
    public void state(){ //没有被abstract修饰，不需要子类重写
        System.out.println("上帝：好，你信仰我了，现在你可以创造并制造武器了");
    }



   public abstract void CreateWeapon();  //创造武器

   public abstract void ManufactureWeapon(); // 生产武器

    //方法不能有实体，即只能写方法名

    public static void main(String[] args) {
        Weapon w = new Weapon() {
            @Override
            public void CreateWeapon() {

            }

            @Override
            public void ManufactureWeapon() {

            }
        };
        w.sentence="上帝：我骗你们的！蠢货们！哈哈，反正这句话是私有的，愚蠢的凡人不可能听见";
        w.name = "孙悟空";
        w.announce();
    }

}
