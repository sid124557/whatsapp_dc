package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0O9;
import X.AnonymousClass4C6;
import X.AnonymousClass4C8;
import X.AnonymousClass4FB;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.AnonymousClass8P9;
import X.C05100Ry;
import X.C18020wc;
import X.C57682u2;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
public final class FlowExtKt$flowWithLifecycle$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass0O9 $lifecycle;
    public final /* synthetic */ AnonymousClass0GC $minActiveState;
    public final /* synthetic */ AnonymousClass4C8 $this_flowWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(r5, r42, r1);
        }

        public final Object A09(Object obj) {
            Object A05 = C73883gE.A05();
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                AnonymousClass4C8 r3 = r1;
                C18020wc r0 = new C18020wc(r42, 0);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(AnonymousClass0GC r2, AnonymousClass0O9 r3, C84814Du r4, AnonymousClass4C8 r5) {
        super(r4, 2);
        this.$lifecycle = r3;
        this.$minActiveState = r2;
        this.$this_flowWithLifecycle = r5;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$minActiveState, this.$lifecycle, r6, this.$this_flowWithLifecycle);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object A09(Object obj) {
        AnonymousClass4FB r4;
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final AnonymousClass4Gm r42 = (AnonymousClass4Gm) this.L$0;
            AnonymousClass0O9 r3 = this.$lifecycle;
            AnonymousClass0GC r2 = this.$minActiveState;
            final AnonymousClass4C8 r1 = this.$this_flowWithLifecycle;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.L$0 = r42;
            this.label = 1;
            r4 = r42;
            if (C05100Ry.A00(r2, r3, this, r0) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
            r4 = (AnonymousClass4FB) this.L$0;
        } else {
            throw AnonymousClass001.A0d();
        }
        r4.Az4((Throwable) null);
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4Gm r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
