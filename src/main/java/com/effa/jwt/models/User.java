package com.effa.jwt.models;

public class User {
    private int user_id;
    private String user_name;
    private String github_username;

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getGithub_username() {
        return github_username;
    }

    public void setGithub_username(String github_username) {
        this.github_username = github_username;
    }

    //    This is added just to be able to pass default users
    public User(int user_id, String user_name, String github_username) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.github_username = github_username;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", github_username='" + github_username + '\'' +
                '}';
    }
}
