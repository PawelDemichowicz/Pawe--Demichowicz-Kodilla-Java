package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    Statistics statistics;
    int userNumber;
    int postsNumber;
    int commentsNumber;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPosts;


    public StatisticsCounter(Statistics statistics)
    {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics()
    {
        userNumber = statistics.userName().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(userNumber>0) {
            averagePostsPerUser = postsNumber/(double)userNumber;
            averageCommentsPerUser = commentsNumber/(double)userNumber;
        }
        else
        {
            averageCommentsPerUser = 0;
            averagePostsPerUser = 0;
        }
        if(postsNumber>0){

            averageCommentsPerPosts = commentsNumber/(double)postsNumber;
        }
        else {
            averageCommentsPerPosts = 0;
        }

    }

    public void showStatistics()
    {
        System.out.println("Statistics of this forum:  ");
        System.out.println("Number of users: " + userNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average number of posts per users: " + averagePostsPerUser);
        System.out.println("Average number of comments per users: " + averageCommentsPerUser);
        System.out.println("Average number of comments per posts: " + averageCommentsPerPosts);

    }

    public int getUserNumber() {
        return userNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }
}
