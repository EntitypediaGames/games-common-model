package org.entitypedia.games.common.exceptions;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class FilterParsingException extends WordGameException {

    public FilterParsingException(Object... params) {
        super(getFormattedMessage(FilterParsingException.class.getSimpleName(), params));
        this.params = params;
    }
}