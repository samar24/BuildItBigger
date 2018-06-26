package com.udacity.gradle.builditbigger;


import android.support.test.runner.AndroidJUnit4;


import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;


@RunWith(AndroidJUnit4.class)
public class MyAppTest implements EndpointsAsyncTask.OnDataDeliver {

    EndpointsAsyncTask endpointsAsyncTask;
    String joke = null;

    @Test
    public void testAsyncTask() {

        endpointsAsyncTask = new EndpointsAsyncTask(this);
        try {
            endpointsAsyncTask.execute();
            joke = endpointsAsyncTask.get();
            assertEquals(joke, "Monica's Joke App :D");
            assertNotNull(joke);


        } catch (Exception e) {

            fail(e.toString());

        }


    }


    @Override
    public void onDataDeliver(String data) {
        joke = data;
    }
}
