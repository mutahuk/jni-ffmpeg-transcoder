package com.example.VideoTranscoder;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.VideoTranscoder.VideoTranscoderTest \
 * com.example.VideoTranscoder.tests/android.test.InstrumentationTestRunner
 */
public class VideoTranscoderTest extends ActivityInstrumentationTestCase<VideoTranscoder> {

    public VideoTranscoderTest() {
        super("com.example.VideoTranscoder", VideoTranscoder.class);
    }

}
