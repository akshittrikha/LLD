package designPatterns.CompositeDesign.Solution2WithCompositeDesign;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftPart;
    ArithmeticExpression rightPart;
    Operation operation;

    Expression(ArithmeticExpression leftPart, ArithmeticExpression rightPart, Operation operation) {
        this.leftPart = leftPart;
        this.rightPart = rightPart;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        switch (this.operation) {
            case ADD:
                return this.leftPart.evaluate() + this.rightPart.evaluate();
            case SUBTRACT:
                return this.leftPart.evaluate() - this.rightPart.evaluate();
            case MULTIPLY:
                return this.leftPart.evaluate() * this.rightPart.evaluate();
            case DIVIDE:
                return this.leftPart.evaluate() / this.rightPart.evaluate();
            default:
                return -1;
        }
    }
}