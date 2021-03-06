package aryastark.com.chucknorrisjokes.app;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by aryastark on 17/10/16.
 */

public class AppController  extends Application{
    private static AppController instance = new AppController();


    //volley request queue
    private RequestQueue requestQueue;

    //private AppController() {}

    public static synchronized AppController getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(getApplicationContext());
        }

        return requestQueue;
    }
    public <T> void  addToRequestQueue(Request<T> request) {
        request.setTag("AppController");
        getRequestQueue().add(request);
    }


    public void cancelPendingRequests() {
        if (requestQueue != null) {
            requestQueue.cancelAll("AppController");
        }
    }
}
