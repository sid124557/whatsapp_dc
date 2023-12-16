package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class PinchGesture extends Gesture {
    public final float scale;

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.PINCH;
    }
}
