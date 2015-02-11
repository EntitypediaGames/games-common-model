package org.entitypedia.games.common.exceptions;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 401)
public class AuthenticatedUserRequiredException extends GameException {

    public AuthenticatedUserRequiredException(Object... params) {
        super(getFormattedMessage(AuthenticatedUserRequiredException.class.getSimpleName(), params));
        this.params = params;
    }
}
