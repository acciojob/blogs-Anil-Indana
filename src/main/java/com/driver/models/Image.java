package com.driver.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String dimensions;

    @ManyToOne
    @JoinColumn
    Blog blog;

    public int getId(){
        return this.id;
    }
    public String getDescription(){return this.description;}
    public String getDimensions() {return this.dimensions;}
    public Blog getBlog(){return this.blog;}

    public void setDescription(String description) {this.description = description;}
    public void setDimensions(String dimensions) {this.dimensions = dimensions;}
    public void setBlog(Blog blog) {this.blog = blog;}
}