package com.zero4kevin.spring.springmvc.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by kevin on 12/24/17.
 */
public class Spitter {
    private Long id;

    @Size(min=3, max=20, message="Username must be between 3 and 30 characters long.")
    @Pattern(regexp="^[a-zA-Z0-9]+$", message="xxxxxx")
    private String username;

    @Size(min=6, max=20, message="xxxx")
    private String password;
    private String fullName;
    private List<Spittle> spittles;

    @Size(min=3,max=50,message="xxxxxx")
    @Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", message="xxx")
    private String email;
    private boolean updateByEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSpittles(List<Spittle> spittles) {
        this.spittles = spittles;
    }

    public List<Spittle> getSpittles() {
        return spittles;
    }

    public void setUpdateByEmail(boolean updateByEmail) {
        this.updateByEmail = updateByEmail;
    }

    public boolean isUpdateByEmail() {
        return updateByEmail;
    }


    @Override
    public boolean equals(Object obj) {
        Spitter other = (Spitter) obj;
        return other.fullName.equals(fullName) && other.username.equals(username) && other.password.equals(password);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
