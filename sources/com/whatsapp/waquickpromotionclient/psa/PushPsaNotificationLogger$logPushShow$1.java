package com.whatsapp.waquickpromotionclient.psa;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3YL;
import X.AnonymousClass4GR;
import X.C373021s;
import X.C45682aP;
import X.C46222bH;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C833748d;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class PushPsaNotificationLogger$logPushShow$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C833748d $quickPromotion;
    public final /* synthetic */ int $surfaceId;
    public int label;
    public final /* synthetic */ C46222bH this$0;

    @DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C45682aP r1 = C46222bH.this.A01;
                int i2 = i2;
                C833748d r0 = r2;
                C373021s r6 = C373021s.IMPRESSION;
                this.label = 1;
                AnonymousClass3YL r02 = (AnonymousClass3YL) r0;
                if (r1.A01.A00(r02.A06, r6, r02.A0F, i2, r02.A00) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(r2, r6, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushPsaNotificationLogger$logPushShow$1(C46222bH r2, C833748d r3, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = r2;
        this.$surfaceId = i;
        this.$quickPromotion = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final C46222bH r5 = this.this$0;
            C73853gB r4 = r5.A02;
            final int i2 = this.$surfaceId;
            final C833748d r2 = this.$quickPromotion;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new PushPsaNotificationLogger$logPushShow$1(this.this$0, this.$quickPromotion, r6, this.$surfaceId);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
