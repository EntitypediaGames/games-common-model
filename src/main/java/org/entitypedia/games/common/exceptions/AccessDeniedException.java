package org.entitypedia.games.common.exceptions;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 403)
public class AccessDeniedException extends GameException {

    public AccessDeniedException(Object... params) {
        super(getFormattedMessage(AccessDeniedException.class.getSimpleName(), params));
        this.params = params;
    }

}
