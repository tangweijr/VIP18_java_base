package twentyClass20180321.twentyClassException;

public class PassWordFormatException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage() + "密码格式错误";
    }
}
