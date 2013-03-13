package com.fernandocejas.MyApplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tv_text;
    private Button b_button;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tv_text = (TextView)findViewById(R.id.text);
        b_button = (Button)findViewById(R.id.button);
        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_text != null) {
                    tv_text.setText("Testing");
                }
            }
        });
    }
}
