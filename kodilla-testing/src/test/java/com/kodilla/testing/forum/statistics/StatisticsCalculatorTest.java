package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class StatisticsCalculatorTest {

    @Mock
    Statistics statistics;

    ArrayList<String> userNames;
    StatisticsCalculator calc;

    @Before
    public void init() {
        assertNotNull(statistics);

        calc = new StatisticsCalculator();

        userNames = new ArrayList<>();
        userNames.add("Jaś");
        userNames.add("Staś");
        userNames.add("Grześ");
        userNames.add("Krzyś");
        userNames.add("Przemuś");
    }

    private List<String> getUsers100() {
        final ArrayList<String> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            users.add("a");
        }

        return users;
    }

    private void initMockito(int commentsCount, int postsCount, List<String> userNames) {
        Mockito.when(statistics.commentsCount()).thenReturn(commentsCount);
        Mockito.when(statistics.postsCount()).thenReturn(postsCount);
        Mockito.when(statistics.userNames()).thenReturn(userNames);
    }

    @Test
    public void calculateAdvStatisticsPosts0() {
        initMockito(10, 0, userNames);
        calc.calculateAdvStatistics(statistics);
        assertEquals(Double.POSITIVE_INFINITY, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(2.0, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(0, calc.getMeanPostsCountPerUser(), 1e-6);
    }

    @Test
    public void calculateAdvStatisticsPosts1000() {
        initMockito(10, 1000, userNames);
        calc.calculateAdvStatistics(statistics);
        assertEquals(0.01, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(2.0, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(200.0, calc.getMeanPostsCountPerUser(), 1e-6);
    }

    @Test
    public void calculateAdvStatisticsComments0() {
        initMockito(0, 10, userNames);
        calc.calculateAdvStatistics(statistics);
        assertEquals(0.0, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(0.0, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(2.0, calc.getMeanPostsCountPerUser(), 1e-6);
    }

    @Test
    public void calculateAdvStatisticsLessCommentsThanPosts() {
        initMockito(5, 10, userNames);
        calc.calculateAdvStatistics(statistics);
        assertEquals(0.5, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(1.0, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(2.0, calc.getMeanPostsCountPerUser(), 1e-6);
    }

    @Test
    public void calculateAdvStatisticsGreaterCommentsThanPosts() {
        initMockito(50, 10, userNames);
        calc.calculateAdvStatistics(statistics);
        assertEquals(5.0, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(10.0, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(2.0, calc.getMeanPostsCountPerUser(), 1e-6);
    }

    @Test
    public void calculateAdvStatisticsUsers0() {
        initMockito(50, 10, new ArrayList<>());
        calc.calculateAdvStatistics(statistics);
        assertEquals(5.0, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(Double.POSITIVE_INFINITY, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(Double.POSITIVE_INFINITY, calc.getMeanPostsCountPerUser(), 1e-6);
    }

    @Test
    public void calculateAdvStatisticsUsers100() {
        initMockito(50, 10, getUsers100());
        calc.calculateAdvStatistics(statistics);
        assertEquals(5.0, calc.getMeanCommentsCountPerPost(), 1e-6);
        assertEquals(0.5, calc.getMeanCommentsCountPerUser(), 1e-6);
        assertEquals(0.1, calc.getMeanPostsCountPerUser(), 1e-6);
    }
}
