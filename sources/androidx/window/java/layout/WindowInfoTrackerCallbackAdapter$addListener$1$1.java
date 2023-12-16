package androidx.window.java.layout;

import X.AnonymousClass001;
import X.AnonymousClass4C6;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C15790rw;
import X.C18020wc;
import X.C57682u2;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C15790rw $consumer;
    public final /* synthetic */ AnonymousClass4C8 $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(C15790rw r2, C84814Du r3, AnonymousClass4C8 r4) {
        super(r3, 2);
        this.$flow = r4;
        this.$consumer = r2;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$consumer, r5, this.$flow);
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8 r3 = this.$flow;
            C18020wc r0 = new C18020wc(this.$consumer, 2);
            this.label = 1;
            if (r3.Az8(this, r0) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
