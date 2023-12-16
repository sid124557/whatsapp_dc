package com.whatsapp.calling.camera;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C138506qU;
import X.C158497k4;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C158497k4 $newScreenShareInfo;
    public int label;
    public final /* synthetic */ C138506qU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(C138506qU r2, C158497k4 r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$newScreenShareInfo = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.this$0.onScreenShareInfoChanged(this.$newScreenShareInfo);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(this.this$0, this.$newScreenShareInfo, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
