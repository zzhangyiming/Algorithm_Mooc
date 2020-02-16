package review;

public class reverse {

    public static String Reverse(String str){
        if(str.equals("")){
            return "";
        }
        int n = str.length();
        StringBuilder string = new StringBuilder();
        for(int i = n-1;i>=0;i--){
            string.append(str.charAt(i));
        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println(Reverse("123456"));
    }

}
