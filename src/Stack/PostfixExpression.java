package Stack;

public class PostfixExpression {


    private Boolean isOperate(String s){ return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"); }
    private Boolean isOperate1(String s){ return s.equals("*") || s.equals("/"); }
    private String postfix(String exp){
         ArrayStack<String> optr = new ArrayStack<String>();
         StringBuilder opnd=new StringBuilder();
        for(int i = 0;i<exp.length();i++) {
            char e = exp.charAt(i);
            if (Character.isDigit(e)) {
                opnd.append(String.valueOf(e));
            }else{
                String s = String.valueOf(e);
                switch (e) {
                    case '+':
                    case '-':
                        if(optr.isEmpty()){
                            optr.push(s);
                        }else if(isOperate(optr.peek())){
                            while(!optr.isEmpty()&&isOperate(optr.peek())) {
                                opnd.append(optr.pop());
                            }
                            optr.push(s);
                        }
                        break;
                    case '*':
                    case '/':
                        if(optr.isEmpty()){
                            optr.push(s);
                        }else if(isOperate1(optr.peek())){
                            while(!optr.isEmpty()&&isOperate1(optr.peek())) {
                                opnd.append(optr.pop());
                            }
                            optr.push(s);
                        }else{
                            optr.push(s);
                        }
                        break;
                    case '(':
                        optr.push("(");
                        break;
                    case ')':
                        while(!optr.isEmpty()){
                            if(optr.peek().equals("(")){
                                optr.pop();
                                break;
                            }else{
                                opnd.append(optr.pop());
                            }
                        }
                        break;
                }
            }
        }
        while(!optr.isEmpty()){
            opnd.append(optr.pop());
        }
        return opnd.toString();
    }

    public static void  main(String[] args){
        String str = "1-2*3/6";
        System.out.println((new PostfixExpression()).postfix(str));

    }
}
