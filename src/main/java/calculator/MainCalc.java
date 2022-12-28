package calculator;

public class MainCalc {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        int x = 2;
        int y = 3;
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );

        System.out.println(
                calc.newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );

        System.out.println(
                calc.newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        IntsCalculator intsCalc = new IntsCalculator();
        System.out.println(intsCalc.pow(x, y));
        System.out.println(intsCalc.sum(x, y));
        System.out.println(intsCalc.mult(x, y));

    }
}
