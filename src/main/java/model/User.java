package model;


import javax.persistence.*;

/**
 * Created by Anders on 2015-11-18.
 */
@Entity

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
