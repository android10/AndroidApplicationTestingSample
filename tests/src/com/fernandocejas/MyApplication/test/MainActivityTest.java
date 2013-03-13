package com.fernandocejas.MyApplication.test;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import com.fernandocejas.MyApplication.MainActivity;
import com.fernandocejas.MyApplication.R;
import com.xtremelabs.robolectric.Robolectric;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Copyright (c) Tuenti Technologies. All rights reserved.
 *
 * @author fcejas
 */
@RunWith(MyApplicationTestRunner.class)
public class MainActivityTest {

    private MainActivity mainActivity;
    private Button button;
    private TextView textView;

    @Before
    public void setUp() {
        mainActivity = new MainActivity();
        mainActivity.onCreate(null);
        button = (Button)mainActivity.findViewById(R.id.button);
        textView = (TextView)mainActivity.findViewById(R.id.text);
    }

    @Test
    public void testMainTextViewValueOnActivityCreation() throws Exception {
        assertThat(textView.getText().toString(), is(equalTo("Hello")));
    }

    @Test
    public void testChangeMainTextViewValue() throws Exception {
        button.performClick();
        assertThat(textView.getText().toString(), is(equalTo("Testing")));
    }
}
