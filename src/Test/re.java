package Test;

public class re {
    public static void main(String[] args) {
        String str = "we are the champiom";
        String str1 = "";
       for(int i = 0; i < str.length();i++){
           if(str.charAt(i)==' '){
               str1+="%20";
           }else{
               str1+=String.valueOf(str.charAt(i));
           }
       }
        System.out.println(str1);
    }

}
