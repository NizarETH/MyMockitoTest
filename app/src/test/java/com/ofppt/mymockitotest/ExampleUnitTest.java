package com.ofppt.mymockitotest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

        @Mock
        Database databaseMock;


        @Test
        public void testQuery()  {




        }
     @Test
     public void ensureMockitoReturnsTheConfiguredValue() {

        // define return value for method getUniqueId()

     }
    }
