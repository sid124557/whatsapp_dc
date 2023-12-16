package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import com.facebook.jni.HybridData;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlatformEventsServiceObjectsWrapper {
    public boolean _isAlive;
    public final HybridData mHybridData;

    private final native void enqueueEventNative(String str);

    private final native HybridData initHybrid();

    public final void start() {
        this._isAlive = true;
    }

    public final void didReceiveEngineEvent(String str) {
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            throw AnonymousClass000.A0E(e, "Invalid json events from engine: ", AnonymousClass001.A0o());
        }
    }
}
