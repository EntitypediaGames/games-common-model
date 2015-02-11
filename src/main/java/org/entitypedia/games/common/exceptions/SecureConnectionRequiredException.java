package org.entitypedia.games.common.exceptions;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class SecureConnectionRequiredException extends GameException {

    public SecureConnectionRequiredException(Object... params) {
        super(getFormattedMessage(SecureConnectionRequiredException.class.getSimpleName(), params));
        this.params = params;
    }

}
