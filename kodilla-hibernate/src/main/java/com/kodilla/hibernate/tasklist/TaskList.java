package com.kodilla.hibernate.tasklist;

import javax.persistence.*;

@Entity
@Table(name = "TASKLIST")
public final class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList(){

    }

    public TaskList(String listName,String description){
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
