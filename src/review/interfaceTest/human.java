package review.interfaceTest;

public class human implements GODS {
    @Override
    public void state() {
        System.out.println("我是神，听我的没错");
    }

    @Override
    public void announce() {
        System.out.println("我是神！突破了！");
    }

    @Override
    public void claim() {
        System.out.println("我本来是人类的，走运");
    }
}
