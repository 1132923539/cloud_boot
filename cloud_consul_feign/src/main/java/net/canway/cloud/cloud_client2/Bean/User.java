package net.canway.cloud.cloud_client2.Bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private String color;


    private Date date;

    public User() {
    }

    public User(Integer id, String name, Integer age, String color, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.date = date;
    }
}
