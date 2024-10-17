package es.unex.aos.lab1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {
    @GeneratedValue
    @Id
    private long id;
    
    private String name;
    private String location;


    public Team(String string, String string2) {
    }
    public Team() {
        //TODO Auto-generated constructor stub
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
}

