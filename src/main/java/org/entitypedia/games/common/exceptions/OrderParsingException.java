package org.entitypedia.games.common.exceptions;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class OrderParsingException extends GameException {

    public OrderParsingException(Object... params) {
        super(getFormattedMessage(OrderParsingException.class.getSimpleName(), params));
        this.params = params;
    }
}
