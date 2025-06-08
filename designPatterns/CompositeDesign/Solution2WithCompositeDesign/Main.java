package designPatterns.CompositeDesign.Solution2WithCompositeDesign;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(30);
        ArithmeticExpression two = new Number(20);
        ArithmeticExpression three = new Number(3);

        Expression exp = new Expression(one, two, Operation.MULTIPLY);
        Expression exp2 = new Expression(exp, three, Operation.DIVIDE);

        System.out.println(exp.evaluate());
        System.out.println(exp2.evaluate());
    }
}