package org.entitypedia.games.common.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Page with results.
 *
 * @param <T> type of result item
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class ResultsPage<T> extends Page {

    /**
     * Overall count of items in the result set.
     */
    private long overallCount;

    /**
     * List of items in the page.
     */
    List<T> items;

    @JsonCreator
    public ResultsPage(@JsonProperty("pageNo") int pageNo, @JsonProperty("pageSize") int pageSize) {
        super(pageNo, pageSize);
    }

    public ResultsPage(Page page) {
        super(page.getPageNo(), page.getPageSize());
    }

    public ResultsPage(int pageNo, int pageSize, long overallCount) {
        this(pageNo, pageSize);
        this.overallCount = overallCount;

        if (-1 != overallCount && getPagesCount() <= pageNo && pageNo != 0) {
            throw new IndexOutOfBoundsException("pageNo is greater than the available number of pages:" + getPagesCount());
        }
    }

    public ResultsPage(Page page, long overallCount) {
        this(page.getPageNo(), page.getPageSize(), overallCount);
    }

    /**
     * Overall count of items in the result set.  -1 indicates item count is unknown.
     */
    public long getOverallCount() {
        return overallCount;
    }

    protected void setOverallCount(long overallCount) {
        this.overallCount = overallCount;
    }

    /**
     * Count of pages in the result set. -1 indicates page count is unknown.
     */
    public long getPagesCount() {
        if (-1 == overallCount) {
            return -1;
        } else {
            return (long) Math.ceil(overallCount / (double) pageSize);
        }
    }

    protected void setPagesCount(long pagesCount) {
        //nop
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}