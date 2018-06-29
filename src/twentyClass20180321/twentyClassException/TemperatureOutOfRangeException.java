package twentyClass20180321.twentyClassException;

public class TemperatureOutOfRangeException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage()+" :温度超出范围";
    }
}
