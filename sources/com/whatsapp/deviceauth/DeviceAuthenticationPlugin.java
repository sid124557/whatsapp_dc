package com.whatsapp.deviceauth;

import X.AnonymousClass0GH;
import X.C15110qn;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.util.Log;

public abstract class DeviceAuthenticationPlugin implements C15110qn {
    public abstract void A00();

    public abstract boolean A01();

    @OnLifecycleEvent(AnonymousClass0GH.ON_CREATE)
    public void onCreate() {
        if (!A01()) {
            Log.d("DeviceAuthenticationPlugin/cannot-authenticate");
        } else {
            A00();
        }
    }
}
