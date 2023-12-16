package com.whatsapp.waquickpromotionclient.psa;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C373021s;
import X.C41062Iu;
import X.C45682aP;
import X.C46222bH;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class PushPsaNotificationLogger$logPushAction$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $campaignId;
    public final /* synthetic */ int $eligibilityDuration;
    public final /* synthetic */ C373021s $qpActionEventEnum;
    public final /* synthetic */ int $surfaceId;
    public int label;
    public final /* synthetic */ C46222bH this$0;

    @DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                C45682aP r0 = C46222bH.this.A01;
                int i = i2;
                String str = str;
                int i2 = i3;
                C373021s r2 = r5;
                C18260x0.A0R(str, r2);
                r0.A01.A00((C41062Iu) null, r2, str, i, i2);
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r9) {
            C46222bH r1 = C46222bH.this;
            int i = i2;
            return new AnonymousClass1(r5, str, r9, i, i3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushPsaNotificationLogger$logPushAction$1(C46222bH r2, C373021s r3, String str, C84814Du r5, int i, int i2) {
        super(r5, 2);
        this.this$0 = r2;
        this.$surfaceId = i;
        this.$campaignId = str;
        this.$eligibilityDuration = i2;
        this.$qpActionEventEnum = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final C46222bH r4 = this.this$0;
            C73853gB r0 = r4.A02;
            final int i2 = this.$surfaceId;
            final String str = this.$campaignId;
            final int i3 = this.$eligibilityDuration;
            final C373021s r5 = this.$qpActionEventEnum;
            AnonymousClass1 r3 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        C46222bH r1 = this.this$0;
        int i = this.$surfaceId;
        return new PushPsaNotificationLogger$logPushAction$1(r1, this.$qpActionEventEnum, this.$campaignId, r9, i, this.$eligibilityDuration);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
