package aryastark.com.chucknorrisjokes.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import aryastark.com.chucknorrisjokes.R;
import aryastark.com.chucknorrisjokes.app.AppPreferences;

public class MainActivity extends AppCompatActivity {

    private AppPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = new AppPreferences(this);
        if (preferences.isFirstTime()) {

        }
    }


    public  void saveUserName (View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        preferences.setUserName(editText.getText().toString().trim());

    }
}
