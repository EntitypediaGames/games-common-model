package org.entitypedia.games.common.exceptions;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class SecureConnectionRequiredException extends WordGameException {

    public SecureConnectionRequiredException(Object... params) {
        super(getFormattedMessage(SecureConnectionRequiredException.class.getSimpleName(), params));
        this.params = params;
    }

}
