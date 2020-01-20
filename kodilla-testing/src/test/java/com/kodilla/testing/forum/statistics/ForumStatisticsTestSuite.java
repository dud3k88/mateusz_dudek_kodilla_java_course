package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private StatisticsCalculator statisticsCalculator;

    @Before
    public void beforeTest (){
        statisticsCalculator = new StatisticsCalculator();
        statisticsMock = mock(Statistics.class);
}

    @Test
    public void calculateAdvStatisticsTestZeroPost (){
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            listMock.add("User");
        }
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getPostsCount());
        Assert.assertEquals(-1, statisticsCalculator.getAvarageCommentPerPost(), 0);
        Assert.assertEquals(0, statisticsCalculator.getAvaragePostPerUser(), 1);
    }

    @Test
    public void calculateStatisticTestThousandPost(){
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i <20; i++) {
            listMock.add("User");
        }

        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, statisticsCalculator.getPostsCount());
        Assert.assertEquals(0.01, statisticsCalculator.getAvarageCommentPerPost(), 0.1);
        Assert.assertEquals(50, statisticsCalculator.getAvaragePostPerUser(), 1);
    }

    @Test
    public void calculateStatisticTestZeroComment(){
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            listMock.add("User");
        }

        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getCommentCount());
        Assert.assertEquals(-1, statisticsCalculator.getAvarageCommentPerPost(), 0.1);
        Assert.assertEquals(0, statisticsCalculator.getAvarageCommentPerUser(), 1);
    }

    @Test
    public void calculateStatisticTestPostsMoreThanComments(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(50, statisticsCalculator.getCommentCount());
        Assert.assertEquals(100, statisticsCalculator.getPostsCount());
        Assert.assertEquals(-0.5, statisticsCalculator.getAvarageCommentPerPost(), 1);
    }

    @Test
    public void calculateStatisticTestCommentsMoreThanPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsCalculator.getCommentCount());
        Assert.assertEquals(50, statisticsCalculator.getPostsCount());
        Assert.assertEquals(2, statisticsCalculator.getAvarageCommentPerPost(), 1);
    }
    @Test
    public void calculateStatisticTestZeroUsers(){
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i <0; i++) {
            listMock.add("User");
        }

        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getUserList());
        Assert.assertEquals(-1, statisticsCalculator.getAvarageCommentPerUser(), 0.1);
        Assert.assertEquals(-1, statisticsCalculator.getAvaragePostPerUser(), 0.1);
    }

    @Test
    public void calculateStatisticTestHundredUsers(){
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            listMock.add("User");
        }

        //Given
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(300);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsCalculator.getUserList());
        Assert.assertEquals(3, statisticsCalculator.getAvarageCommentPerUser(), 0.1);
        Assert.assertEquals(5, statisticsCalculator.getAvaragePostPerUser(), 0.1);
    }


    }



