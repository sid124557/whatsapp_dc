package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C47182cq;
import X.C56952sp;
import X.C57682u2;
import X.C59022wD;
import X.C616331p;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1", f = "GpiaLifetimeManager.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaLifetimeManager$getToken$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C47182cq this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1$1", f = "GpiaLifetimeManager.kt", i = {}, l = {159, 160}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public Object L$0;
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r8) {
            /*
                r7 = this;
                X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
                int r0 = r7.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r1) goto L_0x0022
                if (r0 != r2) goto L_0x004f
                X.C57682u2.A01(r8)
            L_0x000f:
                return r8
            L_0x0010:
                X.C57682u2.A01(r8)
                X.2cq r0 = X.C47182cq.this
                X.4Gj r0 = r0.A01
                if (r0 == 0) goto L_0x0025
                r7.label = r1
                java.lang.Object r0 = r0.BJQ(r7)
                if (r0 != r6) goto L_0x0025
                return r6
            L_0x0022:
                X.C57682u2.A01(r8)
            L_0x0025:
                X.2cq r5 = X.C47182cq.this
                r7.L$0 = r5
                r7.label = r2
                X.3dl r4 = X.C57702u4.A02(r7)
                X.7kf r3 = r5.A06
                X.31B r0 = r5.A02
                byte[] r0 = r0.A0K()
                java.lang.String r2 = X.C18320x8.A0i(r0)
                X.C162457s7.A0D(r2)
                X.3Q9 r1 = new X.3Q9
                r1.<init>(r5, r4)
                java.lang.String r0 = "md-pairing"
                r3.A03(r1, r2, r0)
                java.lang.Object r8 = r4.A00()
                if (r8 != r6) goto L_0x000f
                return r6
            L_0x004f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaLifetimeManager$getToken$1(C47182cq r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            long A06 = C56952sp.A06(this.this$0.A05, 7010);
            final C47182cq r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            obj = C616331p.A01(this, r0, A06);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GpiaLifetimeManager$getToken$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GpiaLifetimeManager$getToken$1(this.this$0, (C84814Du) obj2));
    }
}
