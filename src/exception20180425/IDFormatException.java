package exception20180425;

public class IDFormatException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage() + " ：身份证长度不正确";
    }
}
