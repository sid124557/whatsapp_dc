package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class PanGesture extends Gesture {
    public final float translateX;
    public final float translateY;

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.PAN;
    }
}
