package org.entitypedia.games.common.exceptions;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class GameException extends RuntimeException {

    private static final ResourceBundle messages = ResourceBundle.getBundle("games-common-model-exceptions", Locale.getDefault());

    protected Object[] params;

    /**
     * Constructor.
     * Creates a new Exception by using super(msg) method.
     *
     * @param errorDescription the description of the error
     */
    public GameException(String errorDescription) {
        super(errorDescription);
    }

    /**
     * Constructor.
     * Creates a new Exception by using super(msg, cause) method.
     *
     * @param errorDescription the description of the error
     * @param cause            the cause
     */
    public GameException(String errorDescription, Throwable cause) {
        super(errorDescription, cause);
    }

    public Object[] getParams() {
        return params;
    }

    protected static String getFormattedMessage(String messageKey, Object[] params) {
        return MessageFormat.format(messages.getString(messageKey), params);
    }
}