package com.whatsapp.registration.integritysignals;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass22M;
import X.AnonymousClass2TA;
import X.AnonymousClass4GR;
import X.C56952sp;
import X.C57682u2;
import X.C59022wD;
import X.C616331p;
import X.C73463fX;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2", f = "GpiaRegClient.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$fetchTokenInternal$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $location;
    public final /* synthetic */ String $nonce;
    public int label;
    public final /* synthetic */ AnonymousClass2TA this$0;

    @DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2$1", f = "GpiaRegClient.kt", i = {}, l = {101, 103}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r7) {
            /*
                r6 = this;
                X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
                int r0 = r6.label
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r3) goto L_0x0036
                if (r0 != r2) goto L_0x0060
                X.C57682u2.A01(r7)
            L_0x000f:
                return r7
            L_0x0010:
                X.C57682u2.A01(r7)
                java.lang.String r0 = "GpiaRegClient: prepareIfNeededAndTrigger called"
                com.whatsapp.util.Log.d((java.lang.String) r0)
                X.2TA r0 = X.AnonymousClass2TA.this
                X.7kf r0 = r0.A04
                boolean r0 = r0.A04()
                if (r0 != 0) goto L_0x0039
                java.lang.String r0 = "GpiaRegClient: preparing low latency GPIA client on demand"
                com.whatsapp.util.Log.d((java.lang.String) r0)
                X.2TA r0 = X.AnonymousClass2TA.this
                X.7kf r1 = r0.A04
                java.lang.String r0 = r5
                r6.label = r3
                java.lang.Object r0 = r1.A01(r0, r6)
                if (r0 != r5) goto L_0x0039
                return r5
            L_0x0036:
                X.C57682u2.A01(r7)
            L_0x0039:
                X.2TA r1 = X.AnonymousClass2TA.this
                java.lang.String r4 = r2
                java.lang.String r3 = r5
                r6.label = r2
                X.46G r2 = X.C57702u4.A03(r6)
                java.lang.String r0 = "GpiaRegClient: triggering low latency GPIA client on demand"
                com.whatsapp.util.Log.d((java.lang.String) r0)
                X.7kf r1 = r1.A04
                X.3Q8 r0 = new X.3Q8
                r0.<init>(r2)
                r1.A03(r0, r4, r3)
                X.45B r0 = X.AnonymousClass45B.A00
                r2.BGs(r0)
                java.lang.Object r7 = r2.A06()
                if (r7 != r5) goto L_0x000f
                return r5
            L_0x0060:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(str, str2, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$fetchTokenInternal$2(AnonymousClass2TA r2, String str, String str2, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$location = str;
        this.$nonce = str2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r8 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            long A06 = C56952sp.A06(this.this$0.A03, 4263);
            final AnonymousClass2TA r6 = this.this$0;
            final String str = this.$location;
            final String str2 = this.$nonce;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            Object A00 = C616331p.A00(this, r0, A06);
            if (A00 == r8) {
                return r8;
            }
            return A00;
        } else if (i == 1) {
            try {
                C57682u2.A01(obj);
                return obj;
            } catch (C73463fX e) {
                this.this$0.A02.A00(AnonymousClass22M.A06, e, "on_failure_exception/1004");
                throw e;
            }
        } else {
            throw AnonymousClass001.A0d();
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new GpiaRegClient$fetchTokenInternal$2(this.this$0, this.$location, this.$nonce, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
