package sk.tuke.kpi.kp.linepuzzle.service;

public class CommentException extends  RuntimeException{
    public CommentException(String message) {
        super(message);
    }

    public CommentException(String message, Throwable cause) {
        super(message, cause);
    }

}
