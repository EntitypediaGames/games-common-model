package org.entitypedia.games.common.exceptions;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class FilterParsingException extends GameException {

    public FilterParsingException(Object... params) {
        super(getFormattedMessage(FilterParsingException.class.getSimpleName(), params));
        this.params = params;
    }
}