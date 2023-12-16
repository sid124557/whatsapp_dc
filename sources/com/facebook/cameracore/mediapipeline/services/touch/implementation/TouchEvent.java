package com.facebook.cameracore.mediapipeline.services.touch.implementation;

public class TouchEvent {
    public final TouchEventType eventType;
    public final long id;
    public final long time;
    public final float x;
    public final float y;

    public enum TouchEventType {
        DOWN,
        UP,
        MOVE,
        CANCEL
    }

    public String getTouchEventTypeName() {
        return this.eventType.name();
    }
}
