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

    protected Date creationTime = new Date();

    @JsonIgnore
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

    private void setId(Long id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    private void setCreationTime(Date creationTime) {
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

    private void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "uid=" + getUid() + '}';
    }
}