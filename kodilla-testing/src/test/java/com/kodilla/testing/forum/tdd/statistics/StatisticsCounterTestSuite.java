package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTestSuite
{
    @Test
    public void TestPostsEqualsZero()
    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int n =0; n<100; n++)
        {
            usersList.add("Name");
        }
        int testPostsCount = 0;
        int testCommentsCount = 100;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        double averageCommentsPerPosts = statisticsCounter.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0.0,averageCommentsPerPosts,0.001);
    }

    @Test
    public void TestPostsEqualsThousand()
    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int n =0; n<100; n++)
        {
            usersList.add("Name");
        }
        int testPostsCount = 1000;
        int testCommentsCount = 10000;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        double averageCommentsPerPosts = statisticsCounter.getAverageCommentsPerPosts();
        int postsNumber = statisticsCounter.getPostsNumber();

        //Then
        Assert.assertEquals(1000,postsNumber);
        Assert.assertEquals(10.0,averageCommentsPerPosts,0.001);
    }

    @Test
    public void TestCommentsEqualsZero()
    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int n =0; n<100; n++)
        {
            usersList.add("Name");
        }
        int testPostsCount = 1000;
        int testCommentsCount = 0;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        int commentsNumber  = statisticsCounter.getCommentsNumber();

        //Then
        Assert.assertEquals(0,commentsNumber);
    }

    @Test
    public void TestCommentsLessThanPosts()
    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int n =0; n<100; n++)
        {
            usersList.add("Name");
        }
        int testPostsCount = 1000;
        int testCommentsCount = 500;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        double averageCommentsPerPosts = statisticsCounter.getAverageCommentsPerPosts();
        int commentsNumber  = statisticsCounter.getCommentsNumber();

        //Then
        Assert.assertEquals(500,commentsNumber);
        Assert.assertEquals(0.5,averageCommentsPerPosts,0.001);
    }
    @Test
    public void TestCommentsMoreThanPosts()    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int n =0; n<100; n++)
        {
            usersList.add("Name");
        }
        int testPostsCount = 1000;
        int testCommentsCount = 5000;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        double averageCommentsPerPosts = statisticsCounter.getAverageCommentsPerPosts();
        int commentsNumber  = statisticsCounter.getCommentsNumber();

        //Then
        Assert.assertEquals(5000,commentsNumber);
        Assert.assertEquals(5,averageCommentsPerPosts,0.001);
    }

    @Test
    public void TestUsersNumberEqualsZero()    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();

        int testPostsCount = 1000;
        int testCommentsCount = 5000;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        double averagePostsPerUsers = statisticsCounter.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(0,averagePostsPerUsers,0.001);
    }

    @Test
    public void TestUsersNumberEqualsOneHundred()    {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int n =0; n<100; n++)
        {
            usersList.add("Name");
        }
        int testPostsCount = 1000;
        int testCommentsCount = 5000;

        when(statisticsMock.userName()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(testPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(testCommentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics();
        double averagePostsPerUsers = statisticsCounter.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(10,averagePostsPerUsers,0.001);
    }

}
