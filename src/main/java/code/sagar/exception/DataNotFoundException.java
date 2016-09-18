package code.sagar.exception;

/**
 * @author Sagar
 */
public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -6328286661536343936L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
