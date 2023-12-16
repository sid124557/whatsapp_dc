package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class RotationGesture extends Gesture {
    public final float angle;

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.ROTATE;
    }
}
