/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class Project {
    String id;
    String title;
    Calendar startDate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }
    
    public String toString(){
        return "\nProject Id: " + this.id +
                "\nProject Title: " + this.title +
                "\nStart Date: " + dateFormat.format(startDate.getTime());
    }
    
}
