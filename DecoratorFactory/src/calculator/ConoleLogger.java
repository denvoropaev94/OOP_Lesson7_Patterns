package calculator;

public class ConoleLogger implements Logable{
    @Override
    public void SeeLogs(String msg) {
        System.out.println(msg);
    }
}
