package com.driver.models;

import com.driver.models.Blog;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Blog> blogList = new ArrayList<>();

    public int getId(){return this.id;}
    public String getUserName(){return this.userName;}
    public String getPassword() {return this.password;}
    public String getFirstName(){return this.firstName;}
    public String getLastName() {return this.lastName;}
    public List<Blog> getBlogList() {return this.blogList;}

    public void setUserName(String userName) {this.userName = userName;}
    public void setPassword(String password) {this.password = password;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setBlogList(List<Blog> blogList) {this.blogList = blogList;}
}