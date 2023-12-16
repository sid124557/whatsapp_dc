package com.facebook.video.heroplayer.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4L0;
import X.AnonymousClass71E;
import X.C126386Nr;
import X.C161157p6;
import X.C172358Kr;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicReference;

public class ServiceEventCallbackImpl implements VpsEventCallback {
    public String A00;
    public final AnonymousClass71E A01;
    public final AtomicReference A02;

    public void AyO(C172358Kr r4) {
        C161157p6.A01("ServiceEventCallbackImpl", "skipping log because listener is null", AnonymousClass4L0.A0U());
    }

    public void errorCallback(String str, String str2, String str3) {
        AyO(new C126386Nr(this.A00, str, str2, str3));
    }

    public ServiceEventCallbackImpl(AnonymousClass71E r4, String str, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = r4;
        this.A00 = str == null ? "" : str;
        C161157p6.A01("ServiceEventCallbackImpl", AnonymousClass000.A0P(atomicReference, "setting listener for event callback to: ", AnonymousClass001.A0o()), AnonymousClass4L0.A0U());
    }

    public ServiceEventCallbackImpl(AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = null;
        this.A00 = "";
        C161157p6.A01("ServiceEventCallbackImpl", AnonymousClass000.A0P(atomicReference, "setting listener for event callback to: ", AnonymousClass001.A0o()), AnonymousClass4L0.A0U());
    }
}
