package com.facebook.avatar.autogen.view;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1", f = "AESelfieViewProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AESelfieViewProvider$increaseBrightness$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Activity $activity;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AESelfieViewProvider$increaseBrightness$1(Activity activity, C84814Du r3) {
        super(r3, 2);
        this.$activity = activity;
    }

    public final Object A09(Object obj) {
        Window window;
        Window window2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            Activity activity = this.$activity;
            WindowManager.LayoutParams layoutParams = null;
            if (!(activity == null || (window2 = activity.getWindow()) == null || (layoutParams = window2.getAttributes()) == null)) {
                layoutParams.screenBrightness = 1.0f;
            }
            Activity activity2 = this.$activity;
            if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
                window.setAttributes(layoutParams);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AESelfieViewProvider$increaseBrightness$1(this.$activity, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AESelfieViewProvider$increaseBrightness$1(this.$activity, (C84814Du) obj2));
    }
}
