package dao.exception;

/**
 * Created by ivanpryshchepau on 7/14/16.
 */
public class ConnectionPoolException extends Exception{

    private static final long serialVersionUID = 1L;

    public ConnectionPoolException(String message, Exception e) {
        super(message, e);
    }
}
