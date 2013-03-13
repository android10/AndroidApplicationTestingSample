package com.fernandocejas.MyApplication.test;

import android.app.Application;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.runners.model.InitializationError;

/**
 * Copyright (c) Tuenti Technologies. All rights reserved.
 *
 * @author fcejas
 */
public class MyApplicationTestRunner extends RobolectricTestRunner {
    public MyApplicationTestRunner(Class testClass) throws InitializationError {
        super(testClass);
    }

    @Override protected Application createApplication() {
        return new Application();
    }
}
