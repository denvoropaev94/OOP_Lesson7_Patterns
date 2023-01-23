package calculator;

public class LogFactory implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
        return new CalcDekorator(new Calculator(primaryArg),new ConoleLogger());
    }
}
