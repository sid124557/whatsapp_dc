package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass20D;
import X.AnonymousClass349;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass4GW;
import X.AnonymousClass8P9;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C184638sG;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C69903Yy;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C17280vG {
    public final /* synthetic */ AnonymousClass0GH A00;
    public final /* synthetic */ AnonymousClass0GH A01;
    public final /* synthetic */ AnonymousClass4GR A02;
    public final /* synthetic */ C69903Yy A03;
    public final /* synthetic */ AnonymousClass4GW A04;
    public final /* synthetic */ AnonymousClass4C6 A05;
    public final /* synthetic */ C184638sG A06;

    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(r5, r0, r2);
        }

        public final Object A09(Object obj) {
            C184638sG r2;
            AnonymousClass4GR r1;
            Object A05 = C73883gE.A05();
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                r2 = r2;
                r1 = r0;
                this.L$0 = r2;
                this.L$1 = r1;
                this.label = 1;
                if (r2.BJu((Object) null, this) == A05) {
                    return A05;
                }
            } else if (i == 1) {
                r1 = (AnonymousClass4GR) this.L$1;
                r2 = (C184638sG) this.L$0;
                C57682u2.A01(obj);
            } else if (i == 2) {
                r2 = (C184638sG) this.L$0;
                try {
                    C57682u2.A01(obj);
                    C59022wD r0 = C59022wD.A00;
                    r2.BrM((Object) null);
                    return r0;
                } catch (Throwable th) {
                    th = th;
                    r2.BrM((Object) null);
                    throw th;
                }
            } else {
                throw AnonymousClass001.A0d();
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1((C84814Du) null, r1);
                this.L$0 = r2;
                this.L$1 = null;
                this.label = 2;
                if (AnonymousClass349.A00(this, repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) == A05) {
                    return A05;
                }
                C59022wD r02 = C59022wD.A00;
                r2.BrM((Object) null);
                return r02;
            } catch (Throwable th2) {
                th = th2;
                r2.BrM((Object) null);
                throw th;
            }
        }

        /* renamed from: A0B */
        public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
            return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
        }
    }

    public final void BcK(AnonymousClass0GH r7, C15910sA r8) {
        C162457s7.A0J(r7, 1);
        if (r7 == this.A01) {
            C69903Yy r4 = this.A03;
            AnonymousClass4C6 r3 = this.A05;
            final C184638sG r2 = this.A06;
            final AnonymousClass4GR r0 = this.A02;
            r4.element = C616131n.A02((C85494Gl) null, new AnonymousClass1((C84814Du) null), r3, (AnonymousClass20D) null, 3);
            return;
        }
        if (r7 == this.A00) {
            C69903Yy r1 = this.A03;
            C85474Gj r02 = (C85474Gj) r1.element;
            if (r02 != null) {
                r02.AyX((CancellationException) null);
            }
            r1.element = null;
        }
        if (r7 == AnonymousClass0GH.ON_DESTROY) {
            this.A04.BkD(C59022wD.A00);
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(AnonymousClass0GH r1, AnonymousClass0GH r2, AnonymousClass4GR r3, C69903Yy r4, AnonymousClass4GW r5, AnonymousClass4C6 r6, C184638sG r7) {
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }
}
