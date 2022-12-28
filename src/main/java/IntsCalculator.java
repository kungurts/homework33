public class IntsCalculator implements Ints {

    private Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double a = (double) arg0;
        double b = (double) arg1;
        return (int) target.newFormula().
                    addOperand(a)
                    .addOperand(b)
                    .calculate(Calculator.Operation.SUM)
                    .result();

    }

    @Override
    public int mult(int arg0, int arg1) {
        double a = (double) arg0;
        double b = (double) arg1;
        return (int) target.newFormula().
                addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        double arg0 = (double) a;
        double arg1 = (double) b;
        return (int) target.newFormula().
                addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
