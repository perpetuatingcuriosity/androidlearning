package com.pcurio.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by damaris on 2014-10-27.
 */
public class RibbitApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "sDzpEoid77FJRblQgcygfcM7SSDO1BCBAhymYmS7", "BeLnAbVyxHlJLs2TFufhH1wI84yHzssRVHHwinme");
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
    }
}
