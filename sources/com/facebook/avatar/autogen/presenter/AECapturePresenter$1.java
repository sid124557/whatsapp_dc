package com.facebook.avatar.autogen.presenter;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass412;
import X.AnonymousClass4GR;
import X.AnonymousClass4J5;
import X.AnonymousClass82E;
import X.C1895791v;
import X.C57682u2;
import X.C59022wD;
import X.C74993pQ;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.presenter.AECapturePresenter$1", f = "AECapturePresenter.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class AECapturePresenter$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass82E this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$1(AnonymousClass82E r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass82E r0 = this.this$0;
            AnonymousClass4J5 r3 = new AnonymousClass4J5(new C74993pQ((C84814Du) null, new AnonymousClass412(r0), r0.A06), 4);
            C1895791v r02 = new C1895791v(this.this$0, 0);
            this.label = 1;
            if (r3.Az8(this, r02) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AECapturePresenter$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AECapturePresenter$1(this.this$0, (C84814Du) obj2));
    }
}
