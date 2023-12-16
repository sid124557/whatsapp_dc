package com.whatsapp.calling.camera;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C138506qU;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C138506qU this$0;

    @DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                int i = BrE;
                if (i != 0) {
                    r3.A0B.A01(i);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("ScreenShareCaptureDevice Failed to stop screen sharing: ");
                    C18270x1.A1F(A0o, BrE);
                }
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(r3, r5, BrE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(C138506qU r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final int BrE = this.this$0.A09.BrE();
            final C138506qU r3 = this.this$0;
            C73853gB r2 = r3.A0E;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(this.this$0, (C84814Du) obj2));
    }
}
