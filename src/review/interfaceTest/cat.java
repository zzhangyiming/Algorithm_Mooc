package review.interfaceTest;

public class cat implements GODS {
    @Override
    public void state() {
        System.out.println("我宣布，我是猫神");
    }

    @Override
    public void announce() {
        System.out.println("喵喵喵！");
    }

    @Override
    public void claim() {
        System.out.println("喵！喵！喵！猫又不会说话，为什么我要说话，当神就一定要说话吗？");
    }
}
