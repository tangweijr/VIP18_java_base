package exception20180425;

public class NameFormatException extends Exception{

    @Override
    public String getMessage() {
        return super.getMessage() + " ：姓名格式不正确";
    }
}
