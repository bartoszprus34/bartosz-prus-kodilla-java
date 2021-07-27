package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theList = new ArrayList<>();

    public List<ForumUser> getUserList() {
        theList.add(new ForumUser(55, "Helena", 'F', LocalDate.of(2011, 1, 5), 3));
        theList.add(new ForumUser(23, "Giannis", 'M', LocalDate.of(2006, 8, 3), 19));
        theList.add(new ForumUser(4556, "Derrick", 'M', LocalDate.of(1970, 2, 9), 0));
        theList.add(new ForumUser(6744, "Michael", 'M', LocalDate.of(1980, 11, 30), 10));
        theList.add(new ForumUser(222, "Donata", 'F', LocalDate.of(1967, 2, 11), 4));
        theList.add(new ForumUser(8, "Christine", 'F', LocalDate.of(2000, 12, 25), 40));
        return new ArrayList<>(theList);
    }
}