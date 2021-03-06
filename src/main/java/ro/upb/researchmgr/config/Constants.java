package ro.upb.researchmgr.config;

/**
 * Application constants.
 */
public final class Constants {

    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";

    public static final String UPLOAD_DIR = "paperWorkAttachments/";
    public static final String ROOT_FOLDER = "src/main/webapp";
    private Constants() {
    }
}
