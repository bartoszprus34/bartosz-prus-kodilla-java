package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double meanPostsCountPerUser;
    private double meanCommentsCountPerUser;
    private double meanCommentsCountPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        meanPostsCountPerUser = (double)postsCount / usersCount;
        meanCommentsCountPerUser = (double)commentsCount / usersCount;
        meanCommentsCountPerPost = (double)commentsCount / postsCount;
    }

    public double getMeanPostsCountPerUser() {
        return meanPostsCountPerUser;
    }

    public double getMeanCommentsCountPerUser() {
        return meanCommentsCountPerUser;
    }

    public double getMeanCommentsCountPerPost() {
        return meanCommentsCountPerPost;
    }
}
