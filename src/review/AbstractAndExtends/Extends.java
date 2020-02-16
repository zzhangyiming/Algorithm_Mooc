package review.AbstractAndExtends;

public class Extends {
    /**
     * 继承的理解
     *
     * 继承像是一种递进衍生的关系，从祖先猿人发展到我们现代人
     *
     */
    static class AncientHuman{ //古人
        String gender; //性别
        AncientHuman(){}
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public void state(){
            System.out.println("我是原始人"+"我的性别是"+this.gender);
        }
    }

     static class NewHuman extends AncientHuman{   //新人类继承古人，有了名字
         String name;
         public String getName() {
             return name;
         }
         public void setName(String name) {
             this.name = name;
         }
         public void state(){
             System.out.println("我是新人类"+"我的性别是"+this.gender+"我叫"+this.name);
         }
     }

    public static class ModernHuman extends  NewHuman{  //现代人类继承新人类
        int age;
        String occupation;  //职业
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getOccupation() {
            return occupation;
        }
        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
        public void state(){
            super.state(); // 继承父类新人类的state()方法
            //System.out.println("我是现代"+"我的性别是"+this.gender+"我叫"+this.name);
        }

    }

    public static void main(String[] args) {

        AncientHuman ancientHuman = new AncientHuman();
        ancientHuman.gender = "男";

        NewHuman newHuman = new NewHuman();
        newHuman.gender = "女";
        newHuman.name = "李清照";

        ModernHuman xiaoming = new ModernHuman();
        xiaoming.gender = "男";
        xiaoming.age = 18;
        xiaoming.occupation = "学生";
        xiaoming.name="小明";


        ancientHuman.state();
        newHuman.state();
        xiaoming.state();

    }
}
