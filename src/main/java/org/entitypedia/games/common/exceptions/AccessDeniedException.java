package org.entitypedia.games.common.exceptions;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 403)
public class AccessDeniedException extends WordGameException {

    public AccessDeniedException(Object... params) {
        super(getFormattedMessage(AccessDeniedException.class.getSimpleName(), params));
        this.params = params;
    }

}
