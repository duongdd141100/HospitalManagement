package model;

import java.sql.Date;

/**
 *
 */
public class Feedback {

    private Long id;
    
    private Date date;
    
    private String text;
    
    private String userFullName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public Feedback(Long id, Date date, String text, String userFullName) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.userFullName = userFullName;
    }

}
