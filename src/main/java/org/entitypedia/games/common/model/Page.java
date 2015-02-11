package org.entitypedia.games.common.model;

/**
 * Represents a result set page.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Page {

    public static final int DEFAULT_PAGE_SIZE = 9;

    /**
     * Page index, 0-based.
     */
    protected int pageNo;

    /**
     * The maximum number of results to be returned in the page.
     */
    protected int pageSize;

    public static Page create() {
        return new Page(0, DEFAULT_PAGE_SIZE);
    }

    public static Page create(Integer pageNo, Integer pageSize) {
        if (null == pageSize) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        if (null == pageNo) {
            pageNo = 0;
        }
        return new Page(pageNo, pageSize);
    }

    /**
     * Default constructor.
     *
     * @param pageNo   page index, 0-based
     * @param pageSize page size
     */
    public Page(int pageNo, int pageSize) {
        if (0 == pageSize) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        if (pageNo < 0) {
            throw new IllegalArgumentException("pageNo must be non-negative integer");
        }
        if (pageSize <= 0) {
            throw new IllegalArgumentException("pageSize must be a positive integer");
        }
        if (100 < pageSize) {
            throw new IllegalArgumentException("pageSize must be less than 100");
        }

        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    /**
     * Page index, 0-based
     *
     * @return page index, 0-based
     */
    public int getPageNo() {
        return pageNo;
    }

    protected void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * Returns the maximum number of results allowed by this page.
     *
     * @return The maximum number of results allowed by this page
     */
    public int getPageSize() {
        return pageSize;
    }

    protected void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}