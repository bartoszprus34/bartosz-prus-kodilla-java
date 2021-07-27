package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int userID, final String name, final char sex, final LocalDate dateOfBirth, final int numberOfPosts) {
        this.userID = userID;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }
    public int getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}