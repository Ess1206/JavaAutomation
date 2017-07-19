package Lesson21;

/**
 * Created by Stan on 05.07.2017.
 */
public enum ERROR {
    LOGIN_ERROR("Wrong", 2),
    INVALIDE_EMAIL("Invalide mail", 3),
    INVALIDE_PASS("Invalide Pass", 4);


    private String message;
    private int errorint;

    public String getMessage() {
        return message;
    }

    public int getErrorint() {
        return errorint;
    }

    ERROR(String message, int errorint) {
        this.errorint = errorint;
        this.message = message;
    }


}
