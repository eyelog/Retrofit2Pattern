package ru.eyelog.retrofit2pattern;

public class User {
    private String user;
    private Integer number;
    private boolean status;

    public User(String user, Integer number, boolean status) {
        this.user = user;
        this.number = number;
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
