package com.example.lenovo.materialdesign;

import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //for setting title of toolbar, (android itself set title for action bar but not for toolbar)
    Toolbar toolbar=(Toolbar)findViewById(R.id.tooBar);
    setSupportActionBar(toolbar);
    //now we can use this toolbar as actionBar
    ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Custom Title");
    //setActionBar(); is used if we have higher api than 21 and we are using inbuilt toolBar

    final FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Snackbar.make(view,"SnackBar", BaseTransientBottomBar.LENGTH_LONG).setAction("undo ", new View.OnClickListener() {
                //undo button name
                //onclickListener is called if button is pressed
                @Override
                public void onClick(View view) {

                }
            }).show();
            //view is view snackbar will be shown at the bottom of parent of view given to it in argument
        }
    });
}

}
