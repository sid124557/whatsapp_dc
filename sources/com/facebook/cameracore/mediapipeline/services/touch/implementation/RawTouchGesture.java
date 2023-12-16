package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class RawTouchGesture extends Gesture {
    public final float translateX;
    public final float translateY;

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.RAW_TOUCH;
    }
}
