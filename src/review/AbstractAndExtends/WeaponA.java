package review.AbstractAndExtends;

public class WeaponA extends Weapon{


    WeaponA(){   // 人类的构造器
        System.out.println("人类：我就是我自己的上帝，我不需要信仰你，你这个神棍！");
    }

    @Override
    public void CreateWeapon() {
        System.out.println("人类：我设计了一把手枪");
    }

    @Override
    public void ManufactureWeapon() {
        System.out.println("人类：我制造了一把手枪，上帝等死吧！");
    }

    @Override
    public void state(){ //人类重写了一个方法
        System.out.println("人类：我重写了这个方法，上帝还说了什么？我不在乎");
    }

    public static void main(String[] args) {
            WeaponA  wa = new WeaponA();
            wa.state();
            wa.announce(); //来听听看神还说了什么？
            wa.CreateWeapon();
            wa.ManufactureWeapon();

    }
}
