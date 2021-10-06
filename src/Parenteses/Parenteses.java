package Parenteses;


import java.util.Stack;

public class Parenteses {

    private String expressao;

    public Parenteses(String pExpressao){
        this.expressao = pExpressao;
    }

    public boolean validarFormacao() {
        Stack controle = new Stack();

        for (int i = 0; i < this.expressao.length(); i++) {
            if (this.expressao.charAt(i) == '{' || this.expressao.charAt(i) == '[' || this.expressao.charAt(i) == '(') {
                controle.push(this.expressao.charAt(i));
            } else if (this.expressao.charAt(i) == ')' || this.expressao.charAt(i) == ']' || this.expressao.charAt(i) == '}') {
                if (controle.isEmpty()) {
                    return false;
                } else if (this.expressao.charAt(i) == ')' && controle.peek().equals('(')) {
                    controle.pop();
                    //calcular
                    continue;
                } else if (this.expressao.charAt(i) == ']' && controle.peek().equals('[')) {
                    controle.pop();
                    //calcular
                    continue;
                } else if (this.expressao.charAt(i) == '}' && controle.peek().equals('{')) {
                    controle.pop();
                    //calcular
                    continue;
                }
                return false;
            }
        }
        if(controle.isEmpty()) return true;
        return false;
    }

    public String getExpressao() {
        return expressao;
    }
}