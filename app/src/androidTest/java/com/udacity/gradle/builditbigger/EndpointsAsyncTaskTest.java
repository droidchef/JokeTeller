package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.test.AndroidTestCase;
import android.util.Pair;

/**
 * @author Ishan Khanna
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {

    public void testAsyncTaskReturnsAJoke() {

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(new Pair<Context, String>(getContext(), "testing"));
        while (!asyncTask.getStatus().equals(AsyncTask.Status.FINISHED)) {
            // wait for it to finish
        }
        assertTrue(asyncTask.isJokeFetchedSuccessfully());
    }
}
