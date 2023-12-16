package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.C194379Sq;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;

public class TouchServiceImpl extends TouchService {
    public final C194379Sq mGestureProcessor = new C194379Sq(this);

    public interface HitTestCallback {
        void hitTestResult(long j, boolean z);
    }

    public static native HybridData initHybrid();

    public native void enqueueForHitTest(Gesture gesture, HitTestCallback hitTestCallback);

    public native void sendGesture(Gesture gesture);

    public native void sendTouchEvent(TouchEvent touchEvent);

    public TouchServiceImpl() {
        super(initHybrid());
    }
}
