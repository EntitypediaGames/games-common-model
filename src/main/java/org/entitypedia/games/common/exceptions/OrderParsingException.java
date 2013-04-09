package org.entitypedia.games.common.exceptions;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class OrderParsingException extends WordGameException {

    public OrderParsingException(Object... params) {
        super(getFormattedMessage(OrderParsingException.class.getSimpleName(), params));
        this.params = params;
    }
}
