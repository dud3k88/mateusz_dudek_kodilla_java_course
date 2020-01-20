package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int userList;
    private int postsCount;
    private int commentCount;
    private double avaragePostPerUser;
    private double avarageCommentPerUser;
    private double avarageCommentPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        userList = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        avarageCommentPerPost = calculateCommentPerPost();
        avarageCommentPerUser = calculateCommentPerUsers();
        avaragePostPerUser = calculatePostPerUsers();
    }

    public double calculatePostPerUsers() {
        if (userList > 0) {
            return (double) postsCount / userList;
        } else {
            return -1;
        }
    }

    public double calculateCommentPerUsers() {
        if (userList > 0) {
            return (double) commentCount / userList;
        } else {
            return -1;
        }
    }

    public double calculateCommentPerPost() {
        if (postsCount > 0) {
            return (double) commentCount / postsCount;
        } else {
            return (double)-1;
        }
    }


    public void showStatistic() {
        System.out.println("Number of users: " + userList);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments " + commentCount);
        System.out.println("Average posts per users: " + avaragePostPerUser);
        System.out.println("Average comments per users: " + avarageCommentPerUser);
        System.out.println("Average comments per posts: " + avarageCommentPerPost);
    }

    public int getUserList() {
        return userList;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvaragePostPerUser() {
        return avaragePostPerUser;
    }

    public double getAvarageCommentPerUser() {
        return avarageCommentPerUser;
    }

    public double getAvarageCommentPerPost() {
        return avarageCommentPerPost;
    }
}


