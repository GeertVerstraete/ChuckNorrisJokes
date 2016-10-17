package aryastark.com.chucknorrisjokes.app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by aryastark on 17/10/16.
 */

public class AppPreferences {
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private Context context;

    public AppPreferences(Context context) {
        this.context = context;
        preferences = this.context.getSharedPreferences(AppPreferences.class.getName(), Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public boolean isFirstTime() {
        return preferences.getBoolean("first", true);

    }

    public void setFirstType(boolean first) {
        if (first) {
            editor.putBoolean("first", false);
            editor.commit();
        }
    }

    public String getUserName() {
        return preferences.getString("first", "");

    }

    public void  setUserName(String userName) {
        editor.putString("userName", userName);
    }
}
