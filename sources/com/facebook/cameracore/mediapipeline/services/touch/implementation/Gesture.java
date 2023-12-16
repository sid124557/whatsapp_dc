package com.facebook.cameracore.mediapipeline.services.touch.implementation;

public abstract class Gesture {
    public final GestureState gestureState;
    public final long id;
    public final float x;
    public final float y;

    public enum GestureState {
        ENDED,
        CANCELLED,
        FAILED
    }

    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public abstract GestureType getGestureType();

    public String getGestureStateName() {
        return this.gestureState.name();
    }

    public String getGestureTypeName() {
        return getGestureType().name();
    }
}
