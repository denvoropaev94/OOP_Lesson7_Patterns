package calculator;

public class CalcDekorator implements Calculable{

    Calculable calc;
    Logable log;
    public CalcDekorator(Calculable calculable, Logable logable) {
        this.calc = calculable;
        this.log = logable;
    }


    @Override
    public Calculable sum(int arg) {
        log.SeeLogs(String.format("Суммирую %d с %d ",calc.getResult(),arg));
        Calculable res = calc.sum(arg);
        log.SeeLogs(String.format("Получаем %d",res.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        log.SeeLogs(String.format("Умножаю %d с %d ",calc.getResult(),arg));
        Calculable res = calc.multi(arg);
        log.SeeLogs(String.format("Получаем %d",res.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}
