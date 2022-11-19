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

            assertNotNull(databaseMock);
            when(databaseMock.isAvailable()).thenReturn(true);
            Service t  = new Service(databaseMock);
            boolean check = t.query("* from t");
            assertThat(check, equalTo(true));


        }
     @Test
     public void ensureMockitoReturnsTheConfiguredValue() {

        // define return value for method getUniqueId()
        when(databaseMock.getUniqueId()).thenReturn(42);

        Service service = new Service(databaseMock);
        // use mock in test....
        assertEquals(service.toString(), "Using database with id: 42");
     }
    }
