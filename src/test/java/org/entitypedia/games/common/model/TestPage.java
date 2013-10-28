package org.entitypedia.games.common.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@RunWith(JUnit4.class)
public class TestPage {

    @Test
    public void testCreate() {
        Page p = Page.create();
        Assert.assertEquals(0, p.getPageNo());
        Assert.assertEquals(Page.DEFAULT_PAGE_SIZE, p.getPageSize());
    }

    @Test
    public void testCreate2() {
        Page p = Page.create(1, 10);
        Assert.assertEquals(1, p.getPageNo());
        Assert.assertEquals(10, p.getPageSize());
    }

    @Test
    public void testCreate3() {
        Page p = Page.create(1, null);
        Assert.assertEquals(1, p.getPageNo());
        Assert.assertEquals(Page.DEFAULT_PAGE_SIZE, p.getPageSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate4() {
        new Page(-1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate5() {
        new Page(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate6() {
        new Page(1, 101);
    }
}