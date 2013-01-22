package org.entitypedia.games.common.exceptions;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 401)
public class AuthenticationException extends WordGameException {

    public AuthenticationException(Object... params) {
        super(getFormattedMessage(AuthenticationException.class.getSimpleName(), params));
        this.params = params;
    }
}