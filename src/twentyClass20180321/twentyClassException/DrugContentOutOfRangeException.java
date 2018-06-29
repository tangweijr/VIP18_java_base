package twentyClass20180321.twentyClassException;

public class DrugContentOutOfRangeException extends Exception {
    @Override
    public String getMessage() {
        return super.getMessage() + " ：含量超标，会吃死人的";
    }
}
