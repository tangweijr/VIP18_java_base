package twentyClass20180321.twentyClassException;

public class AgeOutOfRangeException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage()+" ：年龄超过范围";
    }
}
