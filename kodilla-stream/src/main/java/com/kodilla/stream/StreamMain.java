package com.kodilla.stream;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        Forum forumObject = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forumObject.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> LocalDate.now().getYear()-forumUser.getDateOfBirth().getYear()>19)
                .filter(forumUser -> forumUser.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey()+": " +entry.getValue())
                .forEach(System.out::println);
    }
}