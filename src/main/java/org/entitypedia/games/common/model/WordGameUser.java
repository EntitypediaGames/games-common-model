package org.entitypedia.games.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * Holds common attributes of word game users.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class WordGameUser implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long id;

    protected Date creationTime;

    /**
     * Unique identifier. Random generated sequence of letters and numbers, starts with "p".
     */
    protected String uid;

    @JsonIgnore
    protected String password;

    public WordGameUser() {
    }

    public WordGameUser(String uid) {
        setUid(uid);
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    protected void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "uid=" + getUid() + '}';
    }
}