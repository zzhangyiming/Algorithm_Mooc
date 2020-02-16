package review.AbstractAndExtends;

public class WeaponB extends Weapon {

    WeaponB(){  //🐱的构造器
        System.out.println("猫：天哪，我要信仰你！也许我就可以使用武器了");
    }
    @Override
    public void CreateWeapon() {
        System.out.println("猫：我的武器就是爪子");
    }
    @Override
    public void ManufactureWeapon() {
        System.out.println("猫：我还是不会生产武器。喵喵喵？");
    }

    //state()? 猫不知道怎么重写，那上帝说什么就是什么

    public static void main(String[] args) {
        WeaponB  wb = new WeaponB();
        wb.announce();//来听听看神还说了什么？
        wb.state();
        wb.CreateWeapon();
        wb.ManufactureWeapon();
    }
}
